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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

/**
 * The greeting controller layer in the spring MVC architecture.
 *
 * @author tommy.hamblin.
 */
@Controller
public class GreetingController
{
    /**
     * Returns the JSP for the greeting mapping.
     *
     * @param model - the model to update.
     * @return String - the JSP name.
     */
    @GetMapping("greeting")
    public String getGreeting(final Map<String, Object> model)
    {
        model.put("message", "Hello Tommy");
        return "greeting";
    }
}