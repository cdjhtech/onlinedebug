/**
 * Licensed to the a-chervin (ax.chervin@gmail.com) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * a-chervin licenses this file under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package xryusha.onlinedebug.config.values;

import xryusha.onlinedebug.config.Configuration;

import javax.xml.bind.annotation.*;

/**
 * Specifies constructor invocation
 */
@XmlType(name="constructor")
@XmlRootElement(name = Configuration.Elements.VALUE_CONSTRUCTOR)
@XmlAccessorType(XmlAccessType.FIELD)
public class Constructor extends CallSpec
{
    public Constructor()
    {
        setMethod("<init>");
    }

    public Constructor(String targetClass)
    {
        this();
        setTargetClass(targetClass);
    }
}
