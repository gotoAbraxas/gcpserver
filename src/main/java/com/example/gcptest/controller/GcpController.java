package com.example.gcptest.controller;


import com.example.gcptest.domain.entity.Member;
import com.example.gcptest.domain.request.MemberRequest;
import com.example.gcptest.repository.MemberRepository;
import com.example.gcptest.service.GcpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/member")
@CrossOrigin("*")
public class GcpController {
    private final GcpService gcpService;
    @PostMapping("/save")
    public void save(@RequestBody MemberRequest memberRequest){
        gcpService.save(memberRequest);
    }

    @GetMapping("/all")
    public List<Member> getAll(){
        return  gcpService.getAll();
    }
}
