package com.github.ssw.effectivejava.chapter03;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

}
