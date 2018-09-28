/*
 * Copyright (c) Intellinium SAS, 2014-present
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package io.runtime.mcumgr.response.log;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.runtime.mcumgr.response.McuMgrResponse;

public class McuMgrLevelListResponse extends McuMgrResponse {
    @JsonProperty("level_map")
    public String[] level_map;

    @JsonCreator
    public McuMgrLevelListResponse() {}
}
