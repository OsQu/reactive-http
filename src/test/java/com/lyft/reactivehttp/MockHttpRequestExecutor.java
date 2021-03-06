/*
 *
 *  * Copyright (C) 2012 Lyft, Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.lyft.reactivehttp;

import rx.Observable;

/**
 * @author Alexey Zakharov
 */
public class MockHttpRequestExecutor implements RequestExecutor {
    HttpRequest httpRequest;

    @Override
    public Observable<HttpResponse> execute(HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
        return null;
    }

    @Override
    public Observable<String> executeAsString(HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
        return null;
    }

    @Override
    public <T> Observable<T> execute(HttpRequest httpRequest, Class<T> clazz) {
        this.httpRequest = httpRequest;
        return null;
    }
}
