/*
 * Copyright 2013 Esri.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.esri.gpt.control.webharvest.validator;

import com.esri.gpt.catalog.harvest.protocols.HarvestProtocolAgp2Agp;
import com.esri.gpt.framework.jsf.MessageBroker;

/**
 * AGP to AGP protocol validator
 */
class Agp2AgpValidator implements IValidator {
  private String url;
  private HarvestProtocolAgp2Agp protocol;

  /**
   * Creates instance of the validator.
   * @param url host URL
   * @param protocol protocol
   */
  public Agp2AgpValidator(String url, HarvestProtocolAgp2Agp protocol) {
    this.url = url;
    this.protocol = protocol;
  }

  @Override
  public boolean validate(MessageBroker mb) {
    return true;
  }
}
