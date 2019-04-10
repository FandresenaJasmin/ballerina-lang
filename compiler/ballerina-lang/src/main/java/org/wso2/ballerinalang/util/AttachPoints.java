/*
*  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.wso2.ballerinalang.util;

import org.ballerinalang.model.elements.AttachPoint;

import java.util.Set;

/**
 * {@code AttachPoints} is a helper for annotation attache points.
 *
 * @since 0.974.0
 */
public class AttachPoints {
    public static final int TYPE = 1;
    public static final int RESOURCE = TYPE << 1;
    public static final int FUNCTION = RESOURCE << 1;
    public static final int REMOTE = FUNCTION << 1;
    public static final int PARAMETER = REMOTE << 1;
    public static final int SERVICE = PARAMETER << 1;
    public static final int LISTENER = SERVICE << 1;
    public static final int ANNOTATION = LISTENER << 1;
    public static final int EXTERNAL = ANNOTATION << 1;
    public static final int VAR = EXTERNAL << 1;
    public static final int CONST = VAR << 1;
    public static final int CHANNEL = CONST << 1;

    public static int asMask(Set<AttachPoint.Point> attachPoints) {
        int mask = 0;
        for (AttachPoint.Point point : attachPoints) {
            switch (point) {
                case TYPE:
                    mask |= TYPE;
                    break;
                case RESOURCE:
                    mask |= RESOURCE;
                    break;
                case FUNCTION:
                    mask |= FUNCTION;
                    break;
                case REMOTE:
                    mask |= REMOTE;
                    break;
                case PARAMETER:
                    mask |= PARAMETER;
                    break;
                case SERVICE:
                    mask |= SERVICE;
                    break;
                case LISTENER:
                    mask |= LISTENER;
                    break;
                case ANNOTATION:
                    mask |= ANNOTATION;
                    break;
                case EXTERNAL:
                    mask |= EXTERNAL;
                    break;
                case VAR:
                    mask |= VAR;
                    break;
                case CONST:
                    mask |= CONST;
                    break;
                case CHANNEL:
                    mask |= CHANNEL;
                    break;
            }
        }
        return mask;
    }
}
