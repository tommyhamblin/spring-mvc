/*
 * Copyright 2020 Tommy Hamblin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * you may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.spring.mvc.springmvc.controller;

import com.spring.mvc.springmvc.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The user rest controller layer in the spring MVC architecture.
 *
 * @author tommy.hamblin.
 */
@RestController
public class UserController
{
    /**
     * Get mapping for user objects.
     *
     * @param firstName - the first name of the user.
     * @return User - the modelled user data object.
     */
    @GetMapping("/user")
    public User getUser(final @RequestParam(value = "firstname", defaultValue = "Tommy") String firstName,
                        final @RequestParam(value = "lastname", defaultValue = "Hamblin") String lastName,
                        final @RequestParam(value = "age", defaultValue = "23") int age)
    {
        final User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    /**
     * Post mapping for user objects.
     *
     * @param user - the user to post.
     * @return User - the user data object.
     */
    @PostMapping("/user")
    public User postUser(final User user)
    {
        System.out.println("User first name: " + user.getFirstName());

        return user;
    }
}