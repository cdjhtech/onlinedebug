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

package xryusha.onlinedebug.exceptions;

import xryusha.onlinedebug.config.values.RValue;

import java.util.ArrayList;
import java.util.List;

public class RemoteDataAccessException extends RemoteExceptionBase
{
//    private RValue dataPath;
    List<RValue> path = new ArrayList<>();

    public RemoteDataAccessException(String message, RValue dataPath)
    {
        super(message);
        path.add(dataPath);
    }

    public RemoteDataAccessException(String message, List<RValue> dataPath)
    {
        super(message);
        path.addAll(dataPath);
    }

    public RemoteDataAccessException(String message, Throwable cause, RValue dataPath)
    {
        super(message, cause);
        path.add(dataPath);
    }

    @Override
    public String toString()
    {
        return "RemoteDataAccessException{" +
                "dataPath=" + path +
                '}';
    }
}
