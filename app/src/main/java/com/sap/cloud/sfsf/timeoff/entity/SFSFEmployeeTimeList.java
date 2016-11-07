/**
 * Copyright 2016 SAP SE
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.sap.cloud.sfsf.timeoff.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("d")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SFSFEmployeeTimeList implements Serializable {

  private static final long serialVersionUID = 9122553538948320353L;

  public SFSFEmployeeTimeList() {}

  private List<SFSFEmployeeTime> results = new ArrayList<>();


  public boolean addEmployeeTime(final SFSFEmployeeTime employeeTime) {
    getResults().removeIf(e -> e.getId() == employeeTime.getId());
    return getResults().add(employeeTime);
  }

  public boolean removeEmployeeTime(final SFSFEmployeeTime employeeTime) {
    return getResults().remove(employeeTime);
  }

  public List<SFSFEmployeeTime> getResults() {
    return results;
  }

  public void setResults(final List<SFSFEmployeeTime> results) {
    this.results = results;
  }
}
