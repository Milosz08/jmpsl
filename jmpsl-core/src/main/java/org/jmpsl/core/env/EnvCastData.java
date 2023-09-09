/*
 * Copyright (c) 2023 by MULTIPLE AUTHORS
 *
 * File name: EnvCastData.java
 * Last modified: 28/03/2023, 23:14
 * Project name: jmps-library
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     <http://www.apache.org/license/LICENSE-2.0>
 *
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the license.
 */

package org.jmpsl.core.env;

import lombok.Data;
import lombok.AllArgsConstructor;

/**
 * Simple POJO class storing available single casted property datatype.
 *
 * @param <T> type of casted primitive inbox object
 * @author Miłosz Gilga
 * @since 1.0.2
 */
@Data
@AllArgsConstructor
class EnvCastData<T> {
    private Class<T> castedClazz;
    private ICastCallbackResolver<T> callbackResolver;
}
