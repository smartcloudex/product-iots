/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.iot.integration.common;

import java.io.File;

/**
 * Constants used through out the test suite are defined here.
 */
public final class Constants {
    public static final String DEVICE_ID = "d24f870f390352a41234";
    public static final String NUMBER_NOT_EQUAL_TO_DEVICE_ID = "1111";
    public static final String DEVICE_IMEI = "123123123";
    public static final String AUTOMATION_CONTEXT = "IOT";
    public static final String APPLICATION_JSON = "application/json";
    public static final String APPLICATION_ZIP = "application/zip";
    public static final String APPLICATION_URL_ENCODED = "application/x-www-form-urlencoded";
    public static final String OAUTH_CLIENT_ID = "client_id";
    public static final String OAUTH_CLIENT_SECRET = "client_secret";
    public static final String OAUTH_ACCESS_TOKEN = "access_token";
    public static final String SCOPE = "scope";
    public static final String ANDROID_DEVICE_TYPE = "android";
    public static final String HTTP_METHOD_POST = "POST";
    public static final String HTTP_METHOD_PUT = "PUT";
    public static final String HTTP_METHOD_GET = "GET";
    public static final String HTTP_METHOD_DELETE = "DELETE";
    public static final String DEVICE_IDENTIFIER_KEY = "deviceIdentifier";
    public static final String DEVICE_IDENTIFIERS_KEY = "deviceIDs";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_SOAP_XML = "application/soap+xml; charset=utf-8";
    public static final String UTF8 = "UTF-8";
    public static final int HTTPS_ANALYTICS_PORT = 9445;

    public static final String HTTPS = "https";
    public static final String HTTP = "http";

    public static final int HTTPS_GATEWAY_PORT = 8243;
    public static final int HTTP_GATEWAY_PORT = 8280;

    public static final class APIApplicationRegistration {
        public static final String API_APP_REGISTRATION_ENDPOINT = "/api-application-registration/register";
        public static final String TOKEN_ENDPOINT = "/token";
        public static final String MULTI_TENANT_OAUTH_TOKEN_PAYLOAD = "&grant_type=password&scope=perm:android:enroll"
                + " perm:android:wipe perm:android:ring perm:android:lock-devices perm:android:configure-vpn "
                + "perm:android:configure-wifi perm:android:enroll perm:android:uninstall-application "
                + "perm:android:manage-configuration perm:android:location perm:android:install-application "
                + "perm:android:mute perm:android:change-lock-code perm:android:blacklist-applications "
                + "perm:android:set-password-policy perm:android:encrypt-storage perm:android:clear-password "
                + "perm:android:enterprise-wipe perm:android:info perm:android:view-configuration "
                + "perm:android:upgrade-firmware perm:android:set-webclip perm:android:send-notification "
                + "perm:android:disenroll perm:android:update-application perm:android:unlock-devices "
                + "perm:android:control-camera perm:android:reboot perm:android:logcat appm:read appm:subscribe "
                + "perm:sign-csr perm:admin:devices:view perm:roles:add perm:roles:add-users perm:roles:update "
                +
                "perm:roles:permissions perm:roles:details perm:roles:view perm:roles:create-combined-role " +
                "perm:roles:delete "
                + "perm:dashboard:vulnerabilities perm:dashboard:non-compliant-count perm:dashboard:non-compliant "
                + "perm:dashboard:by-groups perm:dashboard:device-counts perm:dashboard:feature-non-compliant "
                +
                "perm:dashboard:count-overview perm:dashboard:filtered-count perm:dashboard:details perm:get-activity "
                +
                "perm:devices:delete perm:devices:applications perm:devices:effective-policy " +
                "perm:devices:compliance-data "
                +
                "perm:devices:features perm:devices:operations perm:devices:search perm:devices:details " +
                "perm:devices:update "
                + "perm:devices:view perm:view-configuration perm:manage-configuration perm:policies:remove "
                +
                "perm:policies:priorities perm:policies:deactivate perm:policies:get-policy-details " +
                "perm:policies:manage "
                + "perm:policies:activate perm:policies:update perm:policies:changes perm:policies:get-details "
                +
                "perm:users:add perm:users:details perm:users:count perm:users:delete perm:users:roles " +
                "perm:users:user-details "
                +
                "perm:users:credentials perm:users:search perm:users:is-exist perm:users:update " +
                "perm:users:send-invitation "
                + "perm:admin-users:view perm:groups:devices perm:groups:update perm:groups:add perm:groups:device "
                +
                "perm:groups:devices-count perm:groups:remove perm:groups:groups perm:groups:groups-view " +
                "perm:groups:share "
                +
                "perm:groups:count perm:groups:roles perm:groups:devices-remove perm:groups:devices-add " +
                "perm:groups:assign "
                +
                "perm:device-types:features perm:device-types:types perm:applications:install " +
                "perm:applications:uninstall "
                +
                "perm:admin-groups:count perm:admin-groups:view perm:notifications:mark-checked " +
                "perm:notifications:view "
                + "perm:admin:certificates:delete perm:admin:certificates:details perm:admin:certificates:view "
                + "perm:admin:certificates:add perm:admin:certificates:verify perm:ios:enroll perm:ios:view-device "
                +
                "perm:ios:apn perm:ios:ldap perm:ios:enterprise-app perm:ios:store-application " +
                "perm:ios:remove-application "
                + "perm:ios:app-list perm:ios:profile-list perm:ios:lock perm:ios:enterprise-wipe perm:ios:device-info "
                +
                "perm:ios:restriction perm:ios:email perm:ios:cellular perm:ios:applications perm:ios:wifi " +
                "perm:ios:ring "
                + "perm:ios:location perm:ios:notification perm:ios:airplay perm:ios:caldav perm:ios:cal-subscription "
                +
                "perm:ios:passcode-policy perm:ios:webclip perm:ios:vpn perm:ios:per-app-vpn " +
                "perm:ios:app-to-per-app-vpn "
                + "perm:ios:app-lock perm:ios:clear-passcode perm:ios:remove-profile perm:ios:get-restrictions "
                + "perm:ios:wipe-data perm:admin perm:android:applications perm:devicetype:deployment "
                + "perm:android-sense:enroll perm:admin:device-type perm:device-types:events "
                + "perm:device-types:events:view perm:device-types:types perm:device:enroll perm:device:disenroll "
                +
                "perm:device:modify perm:device:operations perm:device:publish-event perm:devices:operations " +
                "perm:devices:operations perm:firealarm:enroll ";

        public static final String OAUTH_TOKEN_PAYLOAD = "username=admin&password=admin" +
                MULTI_TENANT_OAUTH_TOKEN_PAYLOAD;
        private static StringBuffer dynamicClientPayloadBuffer = new StringBuffer();
        public static final String API_APP_REGISTRATION_PAYLOAD = dynamicClientPayloadBuffer.append("{  \n"
                                                                                                            +
                                                                                                            "   \"applicationName\":\"app_123456\",\n" +
                                                                                                            "   \"isAllowedToAllDomains\":false,\n"
                                                                                                            +
                                                                                                            "   \"tags\":[\"android\", \"device_management\"],\n" +
                                                                                                            "   \"isMappingAnExistingOAuthApp\":false\n"
                                                                                                            + "}")
                .toString();
        public static final String PERMISSION_LIST =
                "appm:read appm:subscribe perm:admin-groups:count perm:admin-groups:view perm:admin-users:view " +
                        "perm:admin:certificates:add perm:admin:certificates:delete perm:admin:certificates:details " +
                        "perm:admin:certificates:verify perm:admin:certificates:view perm:admin:device-type " +
                        "perm:admin:devices:view perm:android-sense:enroll perm:android:applications " +
                        "perm:android:blacklist-applications perm:android:change-lock-code " +
                        "perm:android:clear-password perm:android:configure-vpn perm:android:configure-wifi " +
                        "perm:android:control-camera perm:android:disenroll perm:android:encrypt-storage " +
                        "perm:android:enroll perm:android:enterprise-wipe perm:android:info " +
                        "perm:android:install-application perm:android:location perm:android:lock-devices " +
                        "perm:android:logcat perm:android:manage-configuration perm:android:mute perm:android:reboot " +
                        "perm:android:ring perm:android:send-notification perm:android:set-password-policy " +
                        "perm:android:set-webclip perm:android:uninstall-application perm:android:unlock-devices " +
                        "perm:android:update-application perm:android:upgrade-firmware " +
                        "perm:android:view-configuration perm:android:wipe perm:applications:install " +
                        "perm:applications:uninstall perm:device-types:events perm:device-types:events:view " +
                        "perm:device-types:features perm:device-types:types perm:device:disenroll perm:device:enroll " +
                        "perm:device:modify perm:device:operations perm:device:publish-event " +
                        "perm:devices:applications perm:devices:compliance-data perm:devices:delete " +
                        "perm:devices:details perm:devices:effective-policy perm:devices:features " +
                        "perm:devices:operations perm:devices:search perm:devices:update perm:devices:view " +
                        "perm:devicetype:deployment perm:firealarm:enroll perm:get-activity perm:groups:add " +
                        "perm:groups:assign perm:groups:count perm:groups:device perm:groups:devices " +
                        "perm:groups:devices-add perm:groups:devices-count perm:groups:devices-remove " +
                        "perm:groups:groups perm:groups:groups-view perm:groups:remove perm:groups:roles " +
                        "perm:groups:share perm:groups:update perm:manage-configuration " +
                        "perm:notifications:mark-checked perm:notifications:view perm:policies:activate " +
                        "perm:policies:changes perm:policies:deactivate perm:policies:get-details " +
                        "perm:policies:get-policy-details perm:policies:manage perm:policies:priorities " +
                        "perm:policies:remove perm:policies:update perm:roles:add perm:roles:add-users " +
                        "perm:roles:create-combined-role perm:roles:delete perm:roles:details perm:roles:permissions " +
                        "perm:roles:update perm:roles:view perm:users:add perm:users:count perm:users:credentials " +
                        "perm:users:delete perm:users:details perm:users:is-exist perm:users:roles perm:users:search " +
                        "perm:users:send-invitation perm:users:update perm:users:user-details perm:view-configuration";

        private APIApplicationRegistration() {
            throw new AssertionError();
        }
    }

    public static final class AndroidEnrollment {
        public static final String ENROLLMENT_PAYLOAD_FILE_NAME = "android-enrollment-payloads.json";
        public static final String ENROLLMENT_RESPONSE_PAYLOAD_FILE_NAME = "android-enrollment-response-payloads.json";
        public static final String ENROLLMENT_ENDPOINT = "/api/device-mgt/android/v1.0/devices";
        public static final String ENROLLMENT_GROUP = "android-enrollment";
        public static final String UPDATE_APPLICATION_METHOD = "UPDATE_APPLICATIONS";
        public static final String ANDROID_DEVICE_TYPE = "android";
        public static final String GET_PENDING_OPERATIONS_METHOD = "GET_PENDING_OPERATIONS";

        private AndroidEnrollment() {
            throw new AssertionError();
        }
    }

    public static final class AndroidPolicy {
        public static final String POLICY_RESPONSE_PAYLOAD_FILE_NAME = "android-policy-response-payloads.json";
        public static final String POLICY_ENDPOINT = "/mdm-android-agent/policy/";
        public static final String POLICY_GROUP = "android-policy";
        public static final String GET_EFFECTIVE_POLICY = "getEffectivePolicy";

        private AndroidPolicy() {
            throw new AssertionError();
        }
    }

    public static final class WindowsEnrollment {
        public static final String DISCOVERY_GET_URL = "/mdm-windows-agent/services/discovery/get";
        public static final String DISCOVERY_POST_URL = "/mdm-windows-agent/services/discovery/post";
        public static final String BSD_URL = "/mdm-windows-agent/services/federated/bst/authentication";
        public static final String MS_EXCEP = "/mdm-windows-agent/services/certificatepolicy/xcep";
        public static final String WINDOWS_ENROLLMENT_GROUP = "windows-enrollment";
        public static final String WSTEP_URL = "/mdm-windows-agent/services/deviceenrolment/wstep";
        public static final String SYNC_ML_URL = "/mdm-windows-agent/services/syncml/devicemanagement/request";
        public static final String DISCOVERY_POST_FILE = "windows" + File.separator + "enrollment" + File
                .separator + "discovery-post.xml";
        public static final String MS_XCEP_FILE =
                "windows" + File.separator + "enrollment" + File.separator + "ms_xcep.xml";
        public static final String WS_STEP_FILE =
                "windows" + File.separator + "enrollment" + File.separator + "wstep.xml";
        public static final String BSD_PAYLOAD =
                "{\"credentials\" : {\"username\" : \"admin\", \"email\" : \"admin@wso2.com\", " +
                        "\"password\" : \"admin\", \"ownership\" : \"BYOD\", " +
                        "\"token\" : \"cbe53efd46ec612c456540f8dfef5428\"}}";

        private WindowsEnrollment() {
            throw new AssertionError();
        }
    }

    public static final class AndroidOperations {
        public static final String PAYLOAD_COMMON = "[" + DEVICE_ID + "]";

        public static final String OPERATION_PAYLOAD_FILE_NAME = "android-operation-payloads.json";
        public static final String OPERATIONS_GROUP = "operations";

        public static final String CAMERA_OPERATION = "control-camera";
        public static final String CAMERA_OPERATION_PAYLOAD = "{\n" + "  \"operation\": {\n"
                + "    \"enabled\": false\n" + "  },\n" + "  \"deviceIDs\": [\n" + "    \"" + DEVICE_ID + "\" \n"
                + "  ]\n" + "}";

        public static final String WIPE_DATA_OPERATION = "wipe_data";
        public static final String WIPE_DATA_OPERATION_PAYLOAD = "wipe_data";

        public static final String INSTALL_APPS_OPERATION = "install_apps";
        public static final String NOTIFICATION_OPERATION = "notification";
        public static final String WIFI_OPERATION = "wifi";
        public static final String ENCRYPT_OPERATION = "encrypt";
        public static final String CHANGE_LOCK_OPERATION = "unlock-devices";
        public static final String PASSWORD_POLICY_OPERATION = "password_policy";
        public static final String WEB_CLIP_OPERATION = "web_clip";
        public static final String OPERATION_ENDPOINT = "/api/device-mgt/android/v1.0/admin/devices/";
        public static final String UNLOCK_ENDPOINT = "unlock-devices";
        public static final String UNLOCK_OPERATION_PAYLOAD = PAYLOAD_COMMON;

        public static final String LOCK_ENDPOINT = "lock-devices";
        public static final String LOCK_OPERATION_PAYLOAD = "{ \"deviceIDs\": [\"" + DEVICE_ID + "\"],"
                + "\"operation\": { \"message\": \"string\", \"hardLockEnabled\": false }}";

        public static final String LOCATION_ENDPOINT = "location";
        public static final String LOCATION_PAYLOAD = PAYLOAD_COMMON;

        public static final String CLEAR_PASSWORD_ENDPOINT = "clear-password";
        public static final String CLEAR_PASSWORD_PAYLOAD = PAYLOAD_COMMON;

        public static final String DEVICE_INFO_ENDPOINT = "info";
        public static final String DEVICE_INFO_PAYLOAD = "[\"" + DEVICE_ID + "\"]";

        public static final String DEVICE_LOGCAT_ENDPOINT = "logcat";

        public static final String ENTERPRISE_WIPE_ENDPOINT = "enterprise-wipe";
        public static final String ENTERPRISE_WIPE_PAYLOAD = PAYLOAD_COMMON;

        public static final String WIPE_DATA_ENDPOINT = "wipe";
        public static final String WIPE_DATA_PAYLOAD = "{\n" + "  \"operation\": {\n" + "    \"pin\": \"string\"\n"
                + "  },\n" + "  \"deviceIDs\": [\n" + "    \"" + DEVICE_ID + "\"\n" + "  ]\n" + "}";

        public static final String APPLICATION_LIST_ENDPOINT = "applications";
        public static final String APPLICATION_LIST_PAYLOAD = PAYLOAD_COMMON;

        public static final String RING_ENDPOINT = "ring";
        public static final String RING_PAYLOAD = PAYLOAD_COMMON;

        public static final String MUTE_ENDPOINT = "mute";
        public static final String MUTE_PAYLOAD = PAYLOAD_COMMON;

        public static final String INSTALL_APPS_ENDPOINT = "install-application";
        public static final String UPDATE_APPS_ENDPOINT = "update-application";
        public static final String INSTALL_APPS_PAYLOAD = "{\n" + "  \"deviceIDs\": [\n" + "    \"" + DEVICE_ID + "\"\n"
                + "  ],\n" + "  \"operation\": {\n" + "    \"appIdentifier\": \"string\",\n"
                + "    \"type\": \"string\",\n" + "    \"url\": \"string\"\n" + "  }\n" + "}";

        public static final String UNINSTALL_APPS_ENDPOINT = "uninstall-application";
        public static final String UNINSTALL_APPS_PAYLOAD = "{\n" + "  \"deviceIDs\": [\n"
                + "    \"" + DEVICE_ID + "\"\n" + "  ],\n" + "  \"operation\": {\n"
                + "    \"appIdentifier\": \"string\",\n" + "    \"type\": \"enterprise\"} }";

        public static final String BLACKLIST_APPS_ENDPOINT = "blacklist-applications";
        public static final String BLACKLIST_OPERATION = "black_list_application";

        public static final String UPGRADE_FIRMWARE_ENDPOINT = "upgrade-firmware";
        public static final String UPGRADE_FIRMWARE_OPERATION = "upgrade-firmware";

        public static final String VPN_ENDPOINT = "configure-vpn";
        public static final String VPN_OPERATION = "vpn";

        public static final String NOTIFICATION_ENDPOINT = "send-notification";
        public static final String NOTIFICATION_PAYLOAD = "{\n" + "  \"deviceIDs\": [\n" + "    \"" + DEVICE_ID + "\"\n"
                + "  ],\n" + "  \"operation\": {\n" + "    \"messageText\": \"string\",\n"
                + "    \"messageTitle\": \"string\"\n" + "  }\n" + "}";

        public static final String WIFI_ENDPOINT = "configure-wifi";
        public static final String WIFI_PAYLOAD = "{\n" + "  \"operation\": {\n" + "    \"ssid\": \"string\",\n"
                + "    \"password\": \"string\"\n" + "  },\n" + "  \"deviceIDs\": [\n" + "    \"" + DEVICE_ID + "\"\n"
                + "  ]\n" + "}";

        public static final String ENCRYPT_ENDPOINT = "encrypt-storage";
        public static final String ENCRYPT_PAYLOAD = "{\n" + "  \"operation\": {\n" + "    \"encrypted\": false\n"
                + "  },\n" + "  \"deviceIDs\": [\n" + "    \"" + DEVICE_ID + "\"\n" + "  ]\n" + "}";

        public static final String REBOOT_ENDPOINT = "reboot";
        public static final String REBOOT_PAYLOAD = PAYLOAD_COMMON;
        ;

        public static final String CHANGE_LOCK_ENDPOINT = "change-lock-code";
        public static final String CHANGE_LOCK_PAYLOAD = "{\n" + "  \"operation\": {\n" + "    \"lockCode\": \"0000\"\n"
                + "  },\n" + "  \"deviceIDs\": [\n" + "    \"" + DEVICE_ID + "\"\n" + "  ]\n" + "}\n";

        public static final String PASSWORD_POLICY_ENDPOINT = "set-password-policy";
        public static final String PASSWORD_POLICY_PAYLOAD = "{\n" + "  \"operation\": {\n"
                + "    \"maxFailedAttempts\": 0,\n" + "    \"minLength\": 0,\n" + "    \"pinHistory\": 0,\n"
                + "    \"minComplexChars\": 0,\n" + "    \"maxPINAgeInDays\": 0,\n"
                + "    \"requireAlphanumeric\": false,\n" + "    \"allowSimple\": false\n" + "  },\n"
                + "  \"deviceIDs\": [\n" + "    \"" + DEVICE_ID + "\"\n" + "  ]\n" + "}";

        public static final String WEB_CLIP_ENDPOINT = "set-webclip";
        public static final String WEB_CLIP_PAYLOAD = "{\n" + "  \"operation\": {\n" + "    \"identity\": \"string\",\n"
                + "    \"title\": \"string\",\n" + "    \"type\": \"string\"\n" + "  },\n" + "  \"deviceIDs\": [\n"
                + "    \"" + DEVICE_ID + "\"\n" + "  ]\n" + "}";

        private AndroidOperations() {
            throw new AssertionError();
        }
    }


    public static final class AndroidConfigurationManagement {
        public static final String DEVICE_CONFIGURATION_GROUP = "android-config-mgt";
        public static final String CONFIG_MGT_ENDPOINT = "/api/device-mgt/android/v1.0/configuration/";
        public static final String LICENSE_ENDPOINT = "license";
        public static final String PAYLOAD_FILE_NAME = "android-configuration-payloads.json";
        public static final String RESPONSE_PAYLOAD_FILE_NAME = "android-config-response-payloads.json";

        private AndroidConfigurationManagement() {
            throw new AssertionError();
        }
    }

    public static final class OperationManagement {
        public static final String PATH_APPS = "/apps";
        public static final String OPERATION_MANAGEMENT_GROUP = "api-policy-mgt";
        public static final String GET_DEVICE_APPS_ENDPOINT = "/mdm-admin/operations/android/";
        public static final String GET_DEVICE_OPERATIONS_ENDPOINT = "/mdm-admin/operations/android/";

        private OperationManagement() {
            throw new AssertionError();
        }
    }

    public static final class MobileDeviceManagement {
        public static final String MOBILE_DEVICE_MANAGEMENT_GROUP = "mobile-device-mgt";
        public static final String GET_DEVICE_COUNT_ENDPOINT = "/api/device-mgt/v1.0/devices";
        public static final String CHANGE_DEVICE_STATUS_ENDPOINT = "/api/device-mgt/v1.0/devices/";
        public static final String NO_OF_DEVICES = "1";
        public static final String GET_ALL_DEVICES_ENDPOINT = "/api/device-mgt/v1.0/devices/";
        public static final String USER_DEVICE_ENDPOINT = "user-devices";
        public static final String ADVANCE_SEARCH_ENDPOINT = "search-devices";
        public static final String ADVANCE_SEARCH_OPERATION = "ADVANCE_SEARCH";
        public static final String REQUEST_PAYLOAD_FILE_NAME = "mobile-device-mgt-payloads.json";
        public static final String UPDATE_PAYLOAD_OPERATION = "UPDATE_DEVICE_INFO";
        public static final String VIEW_DEVICE_TYPES_ENDPOINT = "/mdm-admin/devices/types";
        public static final String NO_DEVICE = "{\"devices\":[],\"count\":0}";

        private MobileDeviceManagement() {
            throw new AssertionError();
        }
    }


    public static final class UserManagement {
        public static final String USER_MANAGEMENT_GROUP = "user-mgt";
        public static final String USER_NAME = "username123";
        public static final String USER_ENDPOINT = "/api/device-mgt/v1.0/users";
        public static final String USER_PAYLOAD_FILE_NAME = "user-payloads.json";
        public static final String USER_RESPONSE_PAYLOAD_FILE_NAME = "user-response-payloads.json";
        public static final String GET_ROLES_METHOD = "GET_ROLES";
        public static final String RESET_PASSWORD_PAYLOAD = "RESET_PASSWORD";

        private UserManagement() {
            throw new AssertionError();
        }

    }

    public static final class RoleManagement {
        public static final String ROLE_MANAGEMENT_GROUP = "role-mgt";
        public static final String ROLE_MANAGEMENT_END_POINT = "/api/device-mgt/v1.0/roles";
        public static final String ROLE_PAYLOAD_FILE_NAME = "role-payloads.json";
        public static final String ROLE_RESPONSE_PAYLOAD_FILE_NAME = "role-response-payloads.json";
        public static final String GET_FILTERED_ROLED_METHOD = "GET_FILTERED_ROLES";
        public static final String UPDATE_ROLES_METHOD = "UPDATE_USERS";

        private RoleManagement() {
            throw new AssertionError();
        }

    }

    public static final class PolicyManagement {
        public static final String POLICY_MANAGEMENT_GROUP = "policy-mgt";
        public static final String ADD_POLICY_ENDPOINT = "/mdm-admin/policies/active-policy";
        public static final String POLICY_PAYLOAD_FILE_NAME = "policy-payloads.json";
        public static final String POLICY_RESPONSE_PAYLOAD_FILE_NAME = "policy-response-payloads.json";
        public static final String UPDATE_POLICY_ENDPOINT = "/mdm-admin/policies/1";
        public static final String REMOVE_POLICY_ENDPOINT = "/mdm-admin/policies/bulk-remove";
        public static final String REMOVE_POLICY_PAYLOAD_FILE_NAME = "[1]";
        public static final String VIEW_POLICY_LIST_ENDPOINT = "/api/device-mgt/v1.0/policies";

        private PolicyManagement() {
            throw new AssertionError();
        }
    }

    public static final class FeatureManagement {
        public static final String FEATURE_MANAGEMENT_GROUP = "feature-mgt";
        public static final String VIEW_FEATURES_ENDPOINT = "/mdm-admin/features/android";

        private FeatureManagement() {
            throw new AssertionError();
        }
    }

    public static final class LicenseManagement {
        public static final String LICENSE_MANAGEMENT_GROUP = "license-mgt";
        public static final String GET_LICENSE_ENDPOINT = "/mdm-admin/license/android/en_US";
        public static final String LICENSE_RESPONSE_PAYLOAD_FILE_NAME = "license-response-payloads.json";

        private LicenseManagement() {
            throw new AssertionError();
        }

    }

    public static final class ConfigurationManagement {
        public static final String CONFIGURATION_MANAGEMENT_GROUP = "configuration-mgt";
        public static final String CONFIGURATION_ENDPOINT = "/mdm-admin/configuration";
        public static final String CONFIGURATION_PAYLOAD_FILE_NAME = "configuration-payloads.json";
        public static final String CONFIGURATION_RESPONSE_PAYLOAD_FILE_NAME = "configuration-response-payloads.json";

        private ConfigurationManagement() {
            throw new AssertionError();
        }
    }

    public static final class NotificationManagement {
        public static final String NOTIFICATION_MANAGEMENT_GROUP = "notification-mgt";
        public static final String NOTIFICATION_ENDPOINT = "/mdm-admin/notifications";
        public static final String NOTIFICATION_PAYLOAD_FILE_NAME = "notification-payloads.json";
        public static final String NOTIFICATION_RESPONSE_PAYLOAD_FILE_NAME = "notification-response-payloads.json";
        public static final String NOTIFICATION_UPDATE_ENDPOINT = "/mdm-admin/notifications/1234/NEW";

        private NotificationManagement() {
            throw new AssertionError();
        }
    }

    public static final class AndroidSenseEnrollment {
        public static final String ENROLLMENT_ENDPOINT = "/android_sense/1.0.0/device/";
        public static final String RETRIEVER_ENDPOINT = "analytics/tables/";
        public static final String ANALYTICS_ARTIFACTS_DEPLOYMENT_ENDPOINT =
                "/api/device-mgt/v1.0/admin/publish-artifact/1.0.0/deploy/android_sense";
        public static final String ENROLLMENT_PAYLOAD_FILE_NAME = "android-sense-enrollment-payloads.json";
        public static final String PUBLISH_DATA_OPERATION = "PUBLISH_DATA";
        public static final String BATTERY_STATS_TABLE_NAME = "ORG_WSO2_IOT_ANDROID_BATTERY_STATS";
        public static final String IS_TABLE_EXIST_CHECK_URL = "analytics/table_exists";

        private AndroidSenseEnrollment() {
            throw new AssertionError();
        }
    }

    public static final class QSGManagement {
        public static final String GET_MOBILE_APPS_ENDPONT = "/api/appm/publisher/v1.1/apps/mobileapp";

        private QSGManagement() {
            throw new AssertionError();
        }
    }

    public static final class VirtualFireAlarmConstants {
        public static final String ENROLLMENT_ENDPOINT = "/virtual_firealarm/1.0.0/device/download";
        public static final String STATS_ENDPOINT = "/virtual_firealarm/1.0.0/device/stats";
        public static final String PAYLOAD_FILE = "virtual-fire-alarm-enrollment-payloads.json";
        public static final String ANALYTICS_ARTIFACTS_DEPLOYMENT_ENDPOINT =
                "/api/device-mgt/v1.0/admin/publish-artifact/1.0.0/deploy/virtual_firealarm";
        public static final String POLICY_DATA = "POLICY_DATA";
        public static final String ACTIVATE_POLICY_ENDPOINT = "/api/device-mgt/v1.0/policies/activate-policy";
        public static final String APPLY_CHANGES_ENDPOINT = "/api/device-mgt/v1.0/policies/apply-changes";

    }
}
