/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.homeautomation.doormanager.api.exception;

public class DoorManagerException extends Exception {

    private static final long serialVersionUID = 2736466230451105441L;

    private String errorMessage;

    @SuppressWarnings("unused")
    public DoorManagerException(String msg, DoorManagerException nestedEx) {
        super(msg, nestedEx);
        setErrorMessage(msg);
    }

    public DoorManagerException(String message, Throwable cause) {
        super(message, cause);
        setErrorMessage(message);
    }

    @SuppressWarnings("unused")
    public DoorManagerException(String msg) {
        super(msg);
        setErrorMessage(msg);
    }

    @SuppressWarnings("unused")
    public DoorManagerException() {
        super();
    }

    @SuppressWarnings("unused")
    public DoorManagerException(Throwable cause) {
        super(cause);
    }

    @SuppressWarnings("unused")
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


}
