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

package com.spring.mvc.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * The application runner class.
 *
 * @author tommy.hamblin.
 */
@SpringBootApplication
public class SpringMvcApplication extends SpringBootServletInitializer
{
	/**
	 * The main method used to invoke the application.
	 *
	 * @param args - array of arguments.
	 */
	public static void main(final String[] args)
	{
		SpringApplication.run(SpringMvcApplication.class, args);
	}
}