/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aws.iot.edgeconnectorforkvs.videorecorder.util;

/**
 * Recorder configurations.
 */
public final class Config {
    /**
     * Default GStreamer Version major version.
     */
    static final int GST_VER_MAJOR = 1;
    /**
     * Default GStreamer Version minor version.
     */
    static final int GST_VER_MINOR = 18;
    /**
     * Default GStreamer Version micro version.
     */
    static final int GST_VER_MICRO = 4;
    /**
     * Default GStreamer Version nano version.
     */
    static final int GST_VER_NANO = 0;

    /**
     * Default file rotation period in NS.
     */
    public static final long DEFAULT_FILE_ROTATION_IN_NS = 60_000_000_000L;

    /**
     * Recorder pipeline file branch names.
     */
    public static final String FILE_PATH = "branchFilePath";
    /**
     * Recorder pipeline app callback branch names.
     */
    public static final String CALLBACK_PATH = "branchCallbackPath";
    /**
     * Recorder pipeline app output stream branch names.
     */
    public static final String OSTREAM_PATH = "branchOutputStreamPath";

    /**
     * Default file branch monitor period in milliiseconds.
     */
    public static final long FILE_PATH_MONITOR_PERIOD =
            (long) (Config.DEFAULT_FILE_ROTATION_IN_NS / 1_000_000 * 1.2);
    /**
     * Default app branch monitor period in milliseconds.
     */
    public static final long APP_PATH_MONITOR_PERIOD = 30_000;

    private Config() {}
}
