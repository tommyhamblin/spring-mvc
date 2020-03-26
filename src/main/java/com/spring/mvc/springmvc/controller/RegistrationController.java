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

import com.spring.mvc.springmvc.model.Registration;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * The registration controller layer in the spring MVC architecture.
 *
 * @author tommy.hamblin.
 */
@Controller
public class RegistrationController
{
    /**
     * Returns the JSP for the registration mapping.
     *
     * @param registration - the registration model attribute.
     * @return String - the JSP name.
     */
    @GetMapping("registration")
    public String getRegistration(final @ModelAttribute("registration")Registration registration)
    {
        return "registration";
    }

    /**
     * Post requests for submission from the form.
     *
     * @param registration - the registration model attribute.
     * @return String - the JSP name.
     */
    @PostMapping("registration")
    public String addRegistration(final @Valid @ModelAttribute("registration")Registration registration,
                                  final BindingResult result)
    {
        if(result.hasErrors())
        {
            System.out.println("Has Errors!");
            return "registration";
        }

        System.out.println("Registration: " + registration.getName());
        return "redirect:registration";
    }
}