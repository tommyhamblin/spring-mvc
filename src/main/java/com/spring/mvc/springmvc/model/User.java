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

/**
 * The user model layer in the spring MVC architecture.
 *
 * @author tommy.hamblin.
 */
public class User
{
    /** The first name of the user. */
    private String firstName;

    /** The last name of the user. */
    private String lastName;

    /** The user's age. */
    private int age;

    /**
     * Getter.
     *
     * @return firstName - the user's first name.
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * Setter.
     *
     * @param firstName - the first name to set.
     */
    public void setFirstName(final String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Getter.
     *
     * @return lastName - the user's last name.
     */
    public String getLastName()
    {
        return this.lastName;
    }

    /**
     * Setter.
     *
     * @param lastName - the last name to set.
     */
    public void setLastName(final String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Getter.
     *
     * @return age - the user's age.
     */
    public int getAge()
    {
        return this.age;
    }

    /**
     * Setter.
     *
     * @param age - the age to set.
     */
    public void setAge(final int age)
    {
        this.age = age;
    }
}