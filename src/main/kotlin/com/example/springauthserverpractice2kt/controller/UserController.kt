package com.example.springauthserverpractice2kt.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/v1/users")
@RestController
class UserController {

    @GetMapping("/me")
    fun getMyInfo(): UserInfoResponse =
        UserInfoResponse("jay")

    data class UserInfoResponse(
        val nickname: String,
    )
}
