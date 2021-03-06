/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.config.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfigurationAggregatorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigurationAggregatorMarshaller {

    private static final MarshallingInfo<String> CONFIGURATIONAGGREGATORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationAggregatorName").build();
    private static final MarshallingInfo<String> CONFIGURATIONAGGREGATORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationAggregatorArn").build();
    private static final MarshallingInfo<List> ACCOUNTAGGREGATIONSOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccountAggregationSources").build();
    private static final MarshallingInfo<StructuredPojo> ORGANIZATIONAGGREGATIONSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationAggregationSource").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreatedBy").build();

    private static final ConfigurationAggregatorMarshaller instance = new ConfigurationAggregatorMarshaller();

    public static ConfigurationAggregatorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfigurationAggregator configurationAggregator, ProtocolMarshaller protocolMarshaller) {

        if (configurationAggregator == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configurationAggregator.getConfigurationAggregatorName(), CONFIGURATIONAGGREGATORNAME_BINDING);
            protocolMarshaller.marshall(configurationAggregator.getConfigurationAggregatorArn(), CONFIGURATIONAGGREGATORARN_BINDING);
            protocolMarshaller.marshall(configurationAggregator.getAccountAggregationSources(), ACCOUNTAGGREGATIONSOURCES_BINDING);
            protocolMarshaller.marshall(configurationAggregator.getOrganizationAggregationSource(), ORGANIZATIONAGGREGATIONSOURCE_BINDING);
            protocolMarshaller.marshall(configurationAggregator.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(configurationAggregator.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
            protocolMarshaller.marshall(configurationAggregator.getCreatedBy(), CREATEDBY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
