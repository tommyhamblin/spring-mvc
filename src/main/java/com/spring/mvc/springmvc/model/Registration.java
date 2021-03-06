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

package com.spring.mvc.springmvc.model;

import javax.validation.constraints.NotEmpty;

/**
 * The registration model layer in the spring MVC architecture.
 *
 * @author tommy.hamblin.
 */
public class Registration
{
    /** The String variable for the name. */
    @NotEmpty
    private String name;

    /**
     * Getter.
     *
     * @return name - the registration name.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Setter.
     *
     * @param name - the name to set.
     */
    public void setName(final String name)
    {
        this.name = name;
    }
}