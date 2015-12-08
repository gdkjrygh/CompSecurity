// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.error;

import android.util.Log;

public final class ErrorInfo extends Enum
{

    public static final ErrorInfo KMC_BC_BUSY;
    public static final ErrorInfo KMC_BC_IMAGE_BUFFERED;
    public static final ErrorInfo KMC_BC_INVALID_IMAGE;
    public static final ErrorInfo KMC_BC_NONE;
    public static final ErrorInfo KMC_BC_NO_REPRESENTATION;
    public static final ErrorInfo KMC_BC_UNKNOWN;
    public static final ErrorInfo KMC_CL_CLASSIFIER_BUSY;
    public static final ErrorInfo KMC_CL_CLASSIFIER_NOT_INITIALIZED;
    public static final ErrorInfo KMC_CL_CONFIG_NOT_LOADED;
    public static final ErrorInfo KMC_CL_CONFIG_NULL;
    public static final ErrorInfo KMC_CL_INVALID_IMAGE_SUPPLIED;
    public static final ErrorInfo KMC_CL_LISTENER_NULL;
    public static final ErrorInfo KMC_CL_MAX_NUM_RESULTS_INVALID;
    public static final ErrorInfo KMC_CL_MODEL_NOT_LOADED;
    public static final ErrorInfo KMC_CL_MODEL_NULL;
    public static final ErrorInfo KMC_CL_NO_IMAGE_SUPPLIED;
    public static final ErrorInfo KMC_ED_ALREADY_BUFFERED;
    public static final ErrorInfo KMC_ED_ALREADY_CLEAR;
    public static final ErrorInfo KMC_ED_ALTERNATE_FILEIO_ENGINE;
    public static final ErrorInfo KMC_ED_BITMAP_DIMENSIONS_IMMUTABLE;
    public static final ErrorInfo KMC_ED_BITMAP_DIMENSIONS_NO_UPSCALE;
    public static final ErrorInfo KMC_ED_BITMAP_READ_FROM_FILE_FAILED;
    public static final ErrorInfo KMC_ED_BITMAP_WRITE_TO_FILE_FAILED;
    public static final ErrorInfo KMC_ED_BUFFER;
    public static final ErrorInfo KMC_ED_BUFFERED_READ_FAILED;
    public static final ErrorInfo KMC_ED_BUFFER_ALREADY_CLEARED;
    public static final ErrorInfo KMC_ED_BUFFER_EXISTS;
    public static final ErrorInfo KMC_ED_DELETE_BUFFERED_FILE;
    public static final ErrorInfo KMC_ED_FILEPATH;
    public static final ErrorInfo KMC_ED_FILE_EXISTS;
    public static final ErrorInfo KMC_ED_FILE_NOT_DELETABLE;
    public static final ErrorInfo KMC_ED_FILE_STILL_REMAINS;
    public static final ErrorInfo KMC_ED_IMAGELEAK;
    public static final ErrorInfo KMC_ED_IMAGE_FILE_DIMENSIONS_ERROR;
    public static final ErrorInfo KMC_ED_IMAGE_INVALID_SCALING_FACTOR;
    public static final ErrorInfo KMC_ED_IMAGE_IS_SCALED;
    public static final ErrorInfo KMC_ED_IMAGE_PERFECTION_PROFILE_EMPTY;
    public static final ErrorInfo KMC_ED_IMAGE_WRITTEN_IS_NOT_BITONAL;
    public static final ErrorInfo KMC_ED_IMAGE_WRITTEN_IS_NOT_GRAY;
    public static final ErrorInfo KMC_ED_INVALID_DPI;
    public static final ErrorInfo KMC_ED_INVALID_FOR_OBJECT_REP;
    public static final ErrorInfo KMC_ED_INVALID_ISO_DATE_TIME_FORMAT;
    public static final ErrorInfo KMC_ED_INVALID_JPEG_QUALITY_VALUE;
    public static final ErrorInfo KMC_ED_JPEG_BITDEPTH;
    public static final ErrorInfo KMC_ED_MIMETYPE;
    public static final ErrorInfo KMC_ED_MIMETYPE_MISMATCH;
    public static final ErrorInfo KMC_ED_NOIMAGE;
    public static final ErrorInfo KMC_ED_NONEXISTENT_FILE;
    public static final ErrorInfo KMC_ED_NONEXISTENT_LOAD_SETTINGS_FILE;
    public static final ErrorInfo KMC_ED_NONEXISTENT_OCR_REGION_TYPE;
    public static final ErrorInfo KMC_ED_NO_BUFFERED_IMAGE;
    public static final ErrorInfo KMC_ED_NO_MEMORY_FOR_BUFFERED_FILE;
    public static final ErrorInfo KMC_ED_OBJECT_REP_BITMAP_MISMATCH;
    public static final ErrorInfo KMC_ED_OBJECT_REP_FILE_MISMATCH;
    public static final ErrorInfo KMC_ED_OBJECT_REP_MISMATCH;
    public static final ErrorInfo KMC_ED_OBJECT_REP_NO_BITMAP;
    public static final ErrorInfo KMC_ED_UNRECOGNIZED_MIME_TYPE;
    public static final ErrorInfo KMC_EV_APPEND_ENCRYPTED;
    public static final ErrorInfo KMC_EV_APPEND_TO_FILE;
    public static final ErrorInfo KMC_EV_BAD_CHANNEL;
    public static final ErrorInfo KMC_EV_BAD_DPI;
    public static final ErrorInfo KMC_EV_BAD_FILE_FORMAT;
    public static final ErrorInfo KMC_EV_BAD_LINEWIDTH;
    public static final ErrorInfo KMC_EV_BAD_WIDTH_HEIGHT;
    public static final ErrorInfo KMC_EV_BARCODE_DRIVER;
    public static final ErrorInfo KMC_EV_CANCEL_OPERATION_SUCCESS;
    public static final ErrorInfo KMC_EV_CANNOT_APPEND;
    public static final ErrorInfo KMC_EV_EXTERNAL_PAGE;
    public static final ErrorInfo KMC_EV_FILEOPEN;
    public static final ErrorInfo KMC_EV_FILE_IO_ACCESS_BUSY;
    public static final ErrorInfo KMC_EV_FILE_METADATA;
    public static final ErrorInfo KMC_EV_FILE_READ_FAILED;
    public static final ErrorInfo KMC_EV_HISTOGRAM;
    public static final ErrorInfo KMC_EV_IMAGE_PARM;
    public static final ErrorInfo KMC_EV_IMAGE_PROCESSING;
    public static final ErrorInfo KMC_EV_IMAGE_WRITE_FAILED;
    public static final ErrorInfo KMC_EV_INVALID_HANDLE;
    public static final ErrorInfo KMC_EV_INVALID_POINTER;
    public static final ErrorInfo KMC_EV_LICENSE_ALREADY_SET;
    public static final ErrorInfo KMC_EV_LICENSE_EXPIRED;
    public static final ErrorInfo KMC_EV_LICENSING;
    public static final ErrorInfo KMC_EV_LOCK_CREATION_ERROR;
    public static final ErrorInfo KMC_EV_MEMORY;
    public static final ErrorInfo KMC_EV_METADATA_OVERFLOW;
    public static final ErrorInfo KMC_EV_MMX_PROCESSING;
    public static final ErrorInfo KMC_EV_NETWORK_READ;
    public static final ErrorInfo KMC_EV_NONEXISTANT_IMAGE;
    public static final ErrorInfo KMC_EV_PAPER_SIZE;
    public static final ErrorInfo KMC_EV_PDF_BAD;
    public static final ErrorInfo KMC_EV_PDF_TOO_LARGE;
    public static final ErrorInfo KMC_EV_PROCESS_PAGE_BUSY;
    public static final ErrorInfo KMC_EV_SPEED_ACCURACY;
    public static final ErrorInfo KMC_EV_UNKNOWN_FILETYPE;
    public static final ErrorInfo KMC_GN_BAD_APPLICATION_CONTEXT;
    public static final ErrorInfo KMC_GN_DESERIALIZE_OBJECT_ERROR;
    public static final ErrorInfo KMC_GN_DESERIALIZE_VERSION_ERROR;
    public static final ErrorInfo KMC_GN_FILE_NOT_FOUND;
    public static final ErrorInfo KMC_GN_FILE_NOT_FOUND_EXCEPTION;
    public static final ErrorInfo KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION;
    public static final ErrorInfo KMC_GN_ILLEGAL_THREAD_STATE_EXCEPTION;
    public static final ErrorInfo KMC_GN_INTERNAL_ERROR;
    public static final ErrorInfo KMC_GN_IO_EXCEPTION;
    public static final ErrorInfo KMC_GN_NULL_POINTER_EXCEPTION;
    public static final ErrorInfo KMC_GN_OUT_OF_MEMORY;
    public static final ErrorInfo KMC_GN_PARAM_NEGATIVE;
    public static final ErrorInfo KMC_GN_SESSION_CREATE_ERROR;
    public static final ErrorInfo KMC_GN_SESSION_DISMISS_ERROR;
    public static final ErrorInfo KMC_GN_UNKNOWN_ERROR;
    public static final ErrorInfo KMC_GN_UNSUPPORTED_OPERATION;
    public static final ErrorInfo KMC_IP_FILE_AND_BUFFERED_REPRESENTATION;
    public static final ErrorInfo KMC_IP_LICENSE_ALREADY_SET;
    public static final ErrorInfo KMC_IP_LICENSE_EXPIRED;
    public static final ErrorInfo KMC_IP_LICENSE_INVALID;
    public static final ErrorInfo KMC_IP_NO_PROFILE;
    public static final ErrorInfo KMC_IP_NO_REPRESENTATION;
    public static final ErrorInfo KMC_LO_DEVICE_REG_LICENSING_ERROR;
    public static final ErrorInfo KMC_LO_DOMAIN;
    public static final ErrorInfo KMC_LO_DOWNLOAD_DOCUMENT_FIELDS_ERROR;
    public static final ErrorInfo KMC_LO_DOWNLOAD_DOCUMENT_SCAN_SETTINGS_ERROR;
    public static final ErrorInfo KMC_LO_EMAIL;
    public static final ErrorInfo KMC_LO_EVENT_LOCK_ACQUIRE_ERROR;
    public static final ErrorInfo KMC_LO_IMAGE_NOT_FOUND;
    public static final ErrorInfo KMC_LO_INVALID_DOCUMENT_TYPE_NAME;
    public static final ErrorInfo KMC_LO_INVALID_SERVER_URL;
    public static final ErrorInfo KMC_LO_INVALID_SESSION_STATE;
    public static final ErrorInfo KMC_LO_INVALID_SESSION_STATE_TRANSITION;
    public static final ErrorInfo KMC_LO_LOGIN_NOT_ALLOWED;
    public static final ErrorInfo KMC_LO_NOT_LOGGED_IN;
    public static final ErrorInfo KMC_LO_NOT_REGISTERED;
    public static final ErrorInfo KMC_LO_NO_OPERATION_TO_CANCEL;
    public static final ErrorInfo KMC_LO_OPERATION_CANCELLED;
    public static final ErrorInfo KMC_LO_OPERATION_CANCEL_ERROR;
    public static final ErrorInfo KMC_LO_OPERATION_NOT_CANCELLABLE;
    public static final ErrorInfo KMC_LO_OVERLAPPED_OPERATIONS;
    public static final ErrorInfo KMC_LO_PAGE_IMAGE_INDEX_INVALID;
    public static final ErrorInfo KMC_LO_PAGE_NOT_FOUND;
    public static final ErrorInfo KMC_LO_REGISTERING;
    public static final ErrorInfo KMC_LO_REGISTERING_NOT_ALLOWED;
    public static final ErrorInfo KMC_LO_REQUEST_TIMEOUT;
    public static final ErrorInfo KMC_LO_SERVER_TIMEOUT;
    public static final ErrorInfo KMC_LO_SERVER_URL_NOT_SET;
    public static final ErrorInfo KMC_LO_SESSION_STATE_BUSY;
    public static final ErrorInfo KMC_LO_START_SUBMIT_INVALID_JOB_ID;
    public static final ErrorInfo KMC_LO_START_SUBMIT_JOB_ERROR;
    public static final ErrorInfo KMC_LO_SUBMIT_BITMAP;
    public static final ErrorInfo KMC_LO_SUBMIT_DOCUMENT_FILEIO_ERROR;
    public static final ErrorInfo KMC_LO_SUBMIT_DOCUMENT_FILE_CLOSE_ERROR;
    public static final ErrorInfo KMC_LO_SUBMIT_DOCUMENT_IMAGES_ERROR;
    public static final ErrorInfo KMC_LO_SUBMIT_DOCUMENT_IMAGE_FILE_MISSING;
    public static final ErrorInfo KMC_LO_SUBMIT_DOCUMENT_IMAGE_REP_ERROR;
    public static final ErrorInfo KMC_LO_SUBMIT_DOCUMENT_MIMETYPE_ERROR;
    public static final ErrorInfo KMC_LO_SUBMIT_DOCUMENT_NO_IMAGE_ERROR;
    public static final ErrorInfo KMC_LO_SUBMIT_PNG;
    public static final ErrorInfo KMC_LO_TASK_LOCK_ACQUIRE_ERROR;
    public static final ErrorInfo KMC_LO_USERNAME_NOT_SET;
    public static final ErrorInfo KMC_LO_USER_ALREADY_LOGGED_IN;
    public static final ErrorInfo KMC_LO_USER_ALREADY_LOGGED_OUT;
    public static final ErrorInfo KMC_LO_USER_LOGGING_IN_ON_LOGIN;
    public static final ErrorInfo KMC_LO_USER_LOGGING_OUT_ON_LOGOUT;
    public static final ErrorInfo KMC_LO_USER_LOGIN_ERROR;
    public static final ErrorInfo KMC_LO_USER_LOGOUT_ERROR;
    public static final ErrorInfo KMC_LO_USER_NOT_LOGGED_IN_ON_LOGOUT;
    public static final ErrorInfo KMC_OCR_INVALID_BITMAP_SIZE;
    public static final ErrorInfo KMC_SUCCESS;
    public static final ErrorInfo KMC_UI_CAMERA_ALREADY_OPEN;
    public static final ErrorInfo KMC_UI_CAMERA_LOCK_ACQUIRE_FAILURE;
    public static final ErrorInfo KMC_UI_CAMERA_OPERATION_FAILURE;
    public static final ErrorInfo KMC_UI_FLASH_AUTO_NOT_SUPPORTED;
    public static final ErrorInfo KMC_UI_FLASH_OFF_NOT_SUPPORTED;
    public static final ErrorInfo KMC_UI_FLASH_ON_NOT_SUPPORTED;
    public static final ErrorInfo KMC_UI_FLASH_TORCH_NOT_SUPPORTED;
    public static final ErrorInfo KMC_UI_FOCUS_AREA_COUNT;
    public static final ErrorInfo KMC_UI_FOCUS_AREA_EMPTY;
    public static final ErrorInfo KMC_UI_FOCUS_AREA_INVALID;
    public static final ErrorInfo KMC_UI_FOCUS_AREA_NOT_SUPPORTED;
    public static final ErrorInfo KMC_UI_IMAGE_NULL;
    public static final ErrorInfo KMC_UI_INVALID_ASPECT_RATIO_ARGUMENT;
    public static final ErrorInfo KMC_UI_INVALID_AXIS_THRESHOLD_ARGUMENT;
    public static final ErrorInfo KMC_UI_INVALID_BORDER_THICKNESS_ARGUMENT;
    public static final ErrorInfo KMC_UI_INVALID_DECLINATION_ARGUMENT;
    public static final ErrorInfo KMC_UI_INVALID_HEIGHT_ARGUMENT;
    public static final ErrorInfo KMC_UI_INVALID_PADDING_PERCENTAGE_ARGUMENT;
    public static final ErrorInfo KMC_UI_INVALID_PAGE_THRESHOLD_ARGUMENT;
    public static final ErrorInfo KMC_UI_INVALID_STABILITY_DELAY_ARGUMENT;
    public static final ErrorInfo KMC_UI_INVALID_THRESHOLD_ARGUMENT;
    public static final ErrorInfo KMC_UI_INVALID_WIDTH_ARGUMENT;
    public static final ErrorInfo KMC_UI_SCALING_FACTOR;
    public static final ErrorInfo KMC_UI_VIEW_NULL;
    public static final ErrorInfo KMC_UT_STATS_ALREADY_EXPORTING;
    public static final ErrorInfo KMC_UT_STATS_ALREADY_RECORDING;
    public static final ErrorInfo KMC_UT_STATS_ALREADY_WRITING;
    public static final ErrorInfo KMC_UT_STATS_BEGIN_SESSION_NOT_ALLOWED;
    public static final ErrorInfo KMC_UT_STATS_DATASTORE_NO_UPGRADE_PATH;
    public static final ErrorInfo KMC_UT_STATS_DATASTORE_OUT_OF_DATE;
    public static final ErrorInfo KMC_UT_STATS_DATASTORE_UPGRADE_FAILED;
    public static final ErrorInfo KMC_UT_STATS_DATASTORE_UPGRADE_MISSING_FILE;
    public static final ErrorInfo KMC_UT_STATS_DATASTORE_UPGRADE_NOT_NEEDED;
    public static final ErrorInfo KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE;
    public static final ErrorInfo KMC_UT_STATS_DEVICE_ID_MISSING;
    public static final ErrorInfo KMC_UT_STATS_END_SESSION_NOT_ALLOWED;
    public static final ErrorInfo KMC_UT_STATS_EVENT_THROTTLED;
    public static final ErrorInfo KMC_UT_STATS_EXPORT_HANDLER_MISSING;
    public static final ErrorInfo KMC_UT_STATS_EXPORT_NOT_ALLOWED;
    public static final ErrorInfo KMC_UT_STATS_FILEPATH_IS_NULL;
    public static final ErrorInfo KMC_UT_STATS_INIT_NOT_ALLOWED;
    public static final ErrorInfo KMC_UT_STATS_INVALID_JSON;
    public static final ErrorInfo KMC_UT_STATS_INVALID_STATE_TRANSITION;
    public static final ErrorInfo KMC_UT_STATS_LOG_SESSION_EVENT_NOT_ALLOWED;
    public static final ErrorInfo KMC_UT_STATS_NOTHING_TO_EXPORT;
    public static final ErrorInfo KMC_UT_STATS_NOTHING_TO_PURGE;
    public static final ErrorInfo KMC_UT_STATS_NO_SESSION_BEGUN;
    public static final ErrorInfo KMC_UT_STATS_PURGE_NOT_ALLOWED;
    public static final ErrorInfo KMC_UT_STATS_RECORDING_NOT_OFF;
    public static final ErrorInfo KMC_UT_STATS_RECORDING_NOT_ON;
    public static final ErrorInfo KMC_UT_STATS_RECORD_AND_WRITING_NOT_ALLOWED;
    public static final ErrorInfo KMC_UT_STATS_RECORD_NOT_ALLOWED;
    public static final ErrorInfo KMC_UT_STATS_SESSION_ALREADY_BEGUN;
    public static final ErrorInfo KMC_UT_STATS_STATE_BUSY;
    public static final ErrorInfo KMC_UT_STATS_UNINITIALIZED;
    public static final ErrorInfo KMC_UT_STATS_WRITING_NOT_ALLOWED;
    private static final String e = "ErrorInfo";
    private static final ErrorInfo f[];
    private final int a;
    private final String b;
    private final String c;
    private String d;

    private ErrorInfo(String s, int i, int j, String s1, String s2)
    {
        super(s, i);
        a = j;
        b = s1;
        c = s2;
        d = "";
    }

    public static ErrorInfo valueOf(String s)
    {
        return (ErrorInfo)Enum.valueOf(com/kofax/kmc/kut/utilities/error/ErrorInfo, s);
    }

    public static ErrorInfo[] values()
    {
        return (ErrorInfo[])f.clone();
    }

    public int getErr()
    {
        return a;
    }

    public String getErrCause()
    {
        return d;
    }

    public String getErrDesc()
    {
        return c;
    }

    public String getErrMsg()
    {
        return b;
    }

    public void setErrCause(String s)
    {
        d = s;
        s = new StringBuilder();
        s.append((new StringBuilder()).append("Error code: ").append(a).append("; ").toString());
        s.append((new StringBuilder()).append("Message: ").append(b).append("; ").toString());
        s.append((new StringBuilder()).append("Description: ").append(c).append("; ").toString());
        s.append((new StringBuilder()).append("Cause: ").append(d).append(".").toString());
        Log.i("ErrorInfo", s.toString());
    }

    static 
    {
        KMC_SUCCESS = new ErrorInfo("KMC_SUCCESS", 0, 0, "Success", "Operation Succeeded");
        KMC_GN_FILE_NOT_FOUND = new ErrorInfo("KMC_GN_FILE_NOT_FOUND", 1, 4097, "The referenced file or directory does not exist.", "Attempt was made to read, write, or delete a non-existent file or directory.");
        KMC_GN_OUT_OF_MEMORY = new ErrorInfo("KMC_GN_OUT_OF_MEMORY", 2, 4098, "The operation failed due to an out of memory condition.", "Attempt was made to allocate memory and the native device interface indicates not enough available memory exists.");
        KMC_GN_UNKNOWN_ERROR = new ErrorInfo("KMC_GN_UNKNOWN_ERROR", 3, 4099, "The operation failed due to an unknown error condition.", "Unfortunately, the operation failed due to an error condition that cannot be determined.");
        KMC_GN_PARAM_NEGATIVE = new ErrorInfo("KMC_GN_PARAM_NEGATIVE", 4, 4100, "The operation failed due to a parameter which is less than zero.", "The value of the parameter must be equal to or greater than zero.");
        KMC_GN_UNSUPPORTED_OPERATION = new ErrorInfo("KMC_GN_UNSUPPORTED_OPERATION", 5, 4101, "An unsupported operation was attempted.", "");
        KMC_GN_BAD_APPLICATION_CONTEXT = new ErrorInfo("KMC_GN_BAD_APPLICATION_CONTEXT", 6, 4102, "A valid application context was not set.", "In order to use the Mobile SDK, you must first set a valid application context, or specify the AppContextProvider class in your application's Manifest.");
        KMC_GN_DESERIALIZE_VERSION_ERROR = new ErrorInfo("KMC_GN_DESERIALIZE_VERSION_ERROR", 7, 4103, "The deserialize operation failed due to a version mismatch.", "The version of the serialized file is greater than the SDK version. This operation is not supported.");
        KMC_GN_DESERIALIZE_OBJECT_ERROR = new ErrorInfo("KMC_GN_DESERIALIZE_OBJECT_ERROR", 8, 4104, "The deserialize operation failed due to an object mismatch.", "The object in the serialized file does not match the object performing the deserialize operation.");
        KMC_GN_SESSION_CREATE_ERROR = new ErrorInfo("KMC_GN_SESSION_CREATE_ERROR", 9, 4105, "A session has already been created on the target Mobile SDK object.", "You must dismiss the current session by calling sessionDismiss before creating a new session.");
        KMC_GN_SESSION_DISMISS_ERROR = new ErrorInfo("KMC_GN_SESSION_DISMISS_ERROR", 10, 4106, "A session has not yet been created on the target Mobile SDK object.", "You can only dismiss a session which was created previously.  Create a new session first by calling sessionCreate.");
        KMC_GN_NULL_POINTER_EXCEPTION = new ErrorInfo("KMC_GN_NULL_POINTER_EXCEPTION", 11, 4107, "Null Pointer Exception", "Attempt to access a field or method of an object or an element of an array when there is no instance or array to use.");
        KMC_GN_IO_EXCEPTION = new ErrorInfo("KMC_GN_IO_EXCEPTION", 12, 4108, "IO Exception", "Signals that an I/O exception of some sort has occurred. It represents the general category of exceptions produced by failed or interrupted I/O operations.");
        KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION = new ErrorInfo("KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION", 13, 4109, "Illegal Argument Exception", "Thrown when a method is invoked with an argument which it can not reasonably deal with.");
        KMC_GN_INTERNAL_ERROR = new ErrorInfo("KMC_GN_INTERNAL_ERROR", 14, 4110, "Internal Error", "Thrown when the Mobile SDK notices that it has gotten into an undefined state.");
        KMC_GN_ILLEGAL_THREAD_STATE_EXCEPTION = new ErrorInfo("KMC_GN_ILLEGAL_THREAD_STATE_EXCEPTION", 15, 4111, "Illegal Thread State Exception", "Thrown when an operation is attempted which is not possible given the state that the executing thread is in.");
        KMC_GN_FILE_NOT_FOUND_EXCEPTION = new ErrorInfo("KMC_GN_FILE_NOT_FOUND_EXCEPTION", 16, 4112, "File Not Found Exception", "Thrown when a file specified by an application cannot be found.");
        KMC_LO_INVALID_SERVER_URL = new ErrorInfo("KMC_LO_INVALID_SERVER_URL", 17, 12289, "The server URL specified is invalid, or malformed.", "This should be a fully qualified URL, with the scheme, host name, port number, and server path.");
        KMC_LO_SERVER_URL_NOT_SET = new ErrorInfo("KMC_LO_SERVER_URL_NOT_SET", 18, 12290, "The connection to the server cannot be made because the server URL has not been set.", "Set the Server URL before attempting to connect to the Server.");
        KMC_LO_USERNAME_NOT_SET = new ErrorInfo("KMC_LO_USERNAME_NOT_SET", 19, 12291, "Login to the server cannot be attempted because the username is blank or missing.", "Be sure and specify a username in the UserProfile object before attempting to login to Server.");
        KMC_LO_USER_ALREADY_LOGGED_IN = new ErrorInfo("KMC_LO_USER_ALREADY_LOGGED_IN", 20, 12292, "An attempt was made to login to the server, even though the user is already logged in.", "You are already logged in to the Server.  Logout first, before attempting to login again with the same or different credentials.");
        KMC_LO_USER_NOT_LOGGED_IN_ON_LOGOUT = new ErrorInfo("KMC_LO_USER_NOT_LOGGED_IN_ON_LOGOUT", 21, 12293, "An attempt was made to logout from the server, when the user is not logged in.", "You must already be logged in to the Server before attempting to logout.");
        KMC_LO_USER_LOGGING_IN_ON_LOGIN = new ErrorInfo("KMC_LO_USER_LOGGING_IN_ON_LOGIN", 22, 12294, "An attempt was made to login to the server when the user is already in the process of logging in.", "You are already attempting  to  login to the Server.  Wait for login to complete, then logout first, before attempting to login again with the same or different credentials.");
        KMC_LO_USER_ALREADY_LOGGED_OUT = new ErrorInfo("KMC_LO_USER_ALREADY_LOGGED_OUT", 23, 12295, "An attempt was made to logout from the server when the user is already logged out.", "You are already logged out from the Server.  You must be logged in before logging out.");
        KMC_LO_USER_LOGGING_OUT_ON_LOGOUT = new ErrorInfo("KMC_LO_USER_LOGGING_OUT_ON_LOGOUT", 24, 12296, "An attempt was made to logout from server when the user is already in the process of logging out.", "You are already attempting to logout from the Server when logout is already in progress.  Wait for logout to complete.");
        KMC_LO_DEVICE_REG_LICENSING_ERROR = new ErrorInfo("KMC_LO_DEVICE_REG_LICENSING_ERROR", 25, 12297, "An error occurred attempting to register the mobile device and/or obtain a license.", "Your mobile device either could not be registered, or failed to obtain a license. Contact your System Administrator for help in resolving this issue.");
        KMC_LO_SESSION_STATE_BUSY = new ErrorInfo("KMC_LO_SESSION_STATE_BUSY", 26, 12298, "The requested operation cannot be started because the session state is transitioning as a result of an earlier request.", "Wait for the previous operation to complete, and for the session state to indicate the session state transition is complete.");
        KMC_LO_USER_LOGIN_ERROR = new ErrorInfo("KMC_LO_USER_LOGIN_ERROR", 27, 12299, "An error occurred when attempting to login to the server.", "Check your network connection, and make sure that your Username and Password are valid.");
        KMC_LO_PAGE_NOT_FOUND = new ErrorInfo("KMC_LO_PAGE_NOT_FOUND", 28, 12300, "When attempting to remove a page, that page could not be found.", "Specify a valid page ID for page removal.");
        KMC_LO_IMAGE_NOT_FOUND = new ErrorInfo("KMC_LO_IMAGE_NOT_FOUND", 29, 12301, "The image you want to remove could not be found with the imageID specified.", "Specify a valid image ID for image removal.");
        KMC_LO_DOMAIN = new ErrorInfo("KMC_LO_DOMAIN", 30, 12302, "Domain invalid.", "Specify a valid domain.");
        KMC_LO_EMAIL = new ErrorInfo("KMC_LO_EMAIL", 31, 12303, "Email address invalid.", "For certain servers, an email address is required.  Please specify a valid email address.");
        KMC_LO_NOT_REGISTERED = new ErrorInfo("KMC_LO_NOT_REGISTERED", 32, 12304, "Device not registered yet.", "Use the registerDevice() method to register first.");
        KMC_LO_REGISTERING = new ErrorInfo("KMC_LO_REGISTERING", 33, 12305, "Device registration already in progress.", "Wait until the registration completes before trying to register.");
        KMC_LO_OVERLAPPED_OPERATIONS = new ErrorInfo("KMC_LO_OVERLAPPED_OPERATIONS", 34, 12306, "Overlapped session commands not allowed.", "Wait until the session changed delegate is called before trying another method on the object.");
        KMC_LO_INVALID_SESSION_STATE = new ErrorInfo("KMC_LO_INVALID_SESSION_STATE", 35, 12307, "Unexpected user state found.", "Internal unexpected error.");
        KMC_LO_LOGIN_NOT_ALLOWED = new ErrorInfo("KMC_LO_LOGIN_NOT_ALLOWED", 36, 12308, "Login not allowed in the current state.", "Use server methods in the proper order.");
        KMC_LO_NOT_LOGGED_IN = new ErrorInfo("KMC_LO_NOT_LOGGED_IN", 37, 12309, "You are not logged in.", "Use the registerDevice() and then login() methods for normal sequences.");
        KMC_LO_USER_LOGOUT_ERROR = new ErrorInfo("KMC_LO_USER_LOGOUT_ERROR", 38, 12310, "An error occurred attempting to logout from the server.", "Check your network connection, and make sure that you are successfully logged in prior to calling the logout() method.");
        KMC_LO_TASK_LOCK_ACQUIRE_ERROR = new ErrorInfo("KMC_LO_TASK_LOCK_ACQUIRE_ERROR", 39, 12311, "Attempt to acquire a lock for the task associated with this method failed.", "Internal unexpected error.  No recommendation.");
        KMC_LO_NO_OPERATION_TO_CANCEL = new ErrorInfo("KMC_LO_NO_OPERATION_TO_CANCEL", 40, 12312, "There is no currently running operation to cancel.", "You can only cancel a running operation.");
        KMC_LO_OPERATION_NOT_CANCELLABLE = new ErrorInfo("KMC_LO_OPERATION_NOT_CANCELLABLE", 41, 12313, "The currently running operation cannot be cancelled.", "You can only cancel a running operation that supports cancellation.  Check the developer guide to see what operations are cancellable.");
        KMC_LO_OPERATION_CANCELLED = new ErrorInfo("KMC_LO_OPERATION_CANCELLED", 42, 12314, "The currently running operation was successfully cancelled.", "The operation has been cancelled, and the SESSION_STATE has returned to the previous state.");
        KMC_LO_INVALID_DOCUMENT_TYPE_NAME = new ErrorInfo("KMC_LO_INVALID_DOCUMENT_TYPE_NAME", 43, 12315, "The DocumentType name specified is not valid or not available on the Server.", "Make sure the DocumentType name specified corresponds to a valid DocumentType on the Server. Check with your Administrator to confirm the DocumentType requested is still available.");
        KMC_LO_DOWNLOAD_DOCUMENT_FIELDS_ERROR = new ErrorInfo("KMC_LO_DOWNLOAD_DOCUMENT_FIELDS_ERROR", 44, 12316, "An error occurred attempting to download document fields from the Server.", "Check  your network connection and ask your Administrator to confirm that document fields for the DocumentType requested are still available.");
        KMC_LO_SUBMIT_PNG = new ErrorInfo("KMC_LO_SUBMIT_PNG", 45, 12317, "KMC_LO_SUBMIT_PNG: You cannot submit a document that has an image with the PNG file mime type.", "Change the image object to be represented by a JPG or TIFF mime type format.");
        KMC_LO_SUBMIT_BITMAP = new ErrorInfo("KMC_LO_SUBMIT_BITMAP", 46, 12318, "KMC_LO_SUBMIT_BITMAP: You cannot submit a document when an image is in the IMAGE_REP_BITMAP state.", "The image rep must be FILE or BOTH, and the FILE representation could be FILE_BUFFERED or FILE_STORED.");
        KMC_LO_START_SUBMIT_JOB_ERROR = new ErrorInfo("KMC_LO_START_SUBMIT_JOB_ERROR", 47, 12319, "An error occurred attempting to start a document submission job.", "Check your network connection and ask your Administrator to confirm that your user credentials are valid.  Make sure that your device is still registered.");
        KMC_LO_SUBMIT_DOCUMENT_IMAGES_ERROR = new ErrorInfo("KMC_LO_SUBMIT_DOCUMENT_IMAGES_ERROR", 48, 12320, "An error occurred attempting to submit images and fields within a document to the Server.", "Check your network connection and ask your Administrator to confirm that your user credentials are valid and that your DocumentType is recognized by the Server.");
        KMC_LO_START_SUBMIT_INVALID_JOB_ID = new ErrorInfo("KMC_LO_START_SUBMIT_INVALID_JOB_ID", 49, 12321, "An invalid or missing job ID was detected while starting a document submission job.", "Ask your Administrator to confirm that your Server is configured to accept new document submission jobs.");
        KMC_LO_SUBMIT_DOCUMENT_FILEIO_ERROR = new ErrorInfo("KMC_LO_SUBMIT_DOCUMENT_FILEIO_ERROR", 50, 12322, "While preparing a document for submission, a file I/O error occurred reading an image file in one of the pages.", "Make sure the image file referenced by the Image object in the Document still exists and your application has appropriate file access permissions.");
        KMC_LO_SUBMIT_DOCUMENT_FILE_CLOSE_ERROR = new ErrorInfo("KMC_LO_SUBMIT_DOCUMENT_FILE_CLOSE_ERROR", 51, 12323, "While preparing a document for submission, a file close error occurred after reading an image file in one of the pages.", "Make sure the image file referenced by the Image object in the Document still exists and your application has appropriate file access permissions.");
        KMC_LO_SUBMIT_DOCUMENT_NO_IMAGE_ERROR = new ErrorInfo("KMC_LO_SUBMIT_DOCUMENT_NO_IMAGE_ERROR", 52, 12324, "The document to be submitted contains no pages with images.", "Make sure each document contains at least one page with one image before submitting.");
        KMC_LO_PAGE_IMAGE_INDEX_INVALID = new ErrorInfo("KMC_LO_PAGE_IMAGE_INDEX_INVALID", 53, 12325, "The Image index specified for the current page is invalid.", "Make sure the Image index is >= 0 and < the total number of images in this page.");
        KMC_LO_SUBMIT_DOCUMENT_MIMETYPE_ERROR = new ErrorInfo("KMC_LO_SUBMIT_DOCUMENT_MIMETYPE_ERROR", 54, 12326, "The MIME type specified for one or more of the Images in the Document is not supported for submission to the Server.", "Use a MIME type supported by the Server for each image in the Document to be submitted.");
        KMC_LO_SUBMIT_DOCUMENT_IMAGE_REP_ERROR = new ErrorInfo("KMC_LO_SUBMIT_DOCUMENT_IMAGE_REP_ERROR", 55, 12327, "The Image Representation specified for one or more of the Images in the Document is not supported for submission to the Server.", "Use an Image Representation supported by the Server for each image in the Document to be submitted.");
        KMC_LO_SUBMIT_DOCUMENT_IMAGE_FILE_MISSING = new ErrorInfo("KMC_LO_SUBMIT_DOCUMENT_IMAGE_FILE_MISSING", 56, 12328, "The Image file indicated by the Image object in the Page cannot be found or has been deleted.", "When submitting a Document the Image objects in the Pages must reference existing Image files in the storage system.");
        KMC_LO_OPERATION_CANCEL_ERROR = new ErrorInfo("KMC_LO_OPERATION_CANCEL_ERROR", 57, 12329, "An error occurred while attempting to cancel the running operation. The operation has been terminated.", "Check your network connection and ask your Administrator to confirm that the operation was successfully cancelled.  Some manual clean-up may be necessary if normal cancellation procedures did not complete.");
        KMC_LO_INVALID_SESSION_STATE_TRANSITION = new ErrorInfo("KMC_LO_INVALID_SESSION_STATE_TRANSITION", 58, 12330, "Attempt to transition from one Session State to a subsequent Session State, where the target State is not reachable from the current State.", "Internal unexpected error.  No recommendation.");
        KMC_LO_REGISTERING_NOT_ALLOWED = new ErrorInfo("KMC_LO_REGISTERING_NOT_ALLOWED", 59, 12331, "Registering is not allowed from this session state.", "You should log out, and then re-register.");
        KMC_LO_DOWNLOAD_DOCUMENT_SCAN_SETTINGS_ERROR = new ErrorInfo("KMC_LO_DOWNLOAD_DOCUMENT_SCAN_SETTINGS_ERROR", 60, 12332, "An error occurred attempting to download scan settings", "Check your settings");
        KMC_LO_EVENT_LOCK_ACQUIRE_ERROR = new ErrorInfo("KMC_LO_EVENT_LOCK_ACQUIRE_ERROR", 61, 12333, "Attempt to acquire a lock for the event associated with this method failed.", "Internal unexpected error.  No recommendation.");
        KMC_LO_REQUEST_TIMEOUT = new ErrorInfo("KMC_LO_REQUEST_TIMEOUT", 62, 12336, "Network error: The request timed out.", "Even though web services are available, there was no response to your web service request.  Contact your server administrator to ensure that it is active and available.");
        KMC_LO_SERVER_TIMEOUT = new ErrorInfo("KMC_LO_SERVER_TIMEOUT", 63, 12337, "Server timeout is incorrect", "The value must be greater 0");
        KMC_ED_FILEPATH = new ErrorInfo("KMC_ED_FILEPATH", 64, 24577, "The image object is missing a valid file path.", "Set the file path before calling write, read, or delete file methods.");
        KMC_ED_MIMETYPE = new ErrorInfo("KMC_ED_MIMETYPE", 65, 24578, "The image object has an invalid mimetype setting.", "Set a valid mimetype before calling the write image method.");
        KMC_ED_NOIMAGE = new ErrorInfo("KMC_ED_NOIMAGE", 66, 24579, "No bitmap in the image object is specified for writing.", "Specify a valid bitmap for use when writing the image.");
        KMC_ED_IMAGELEAK = new ErrorInfo("KMC_ED_IMAGELEAK", 67, 24580, "A bitmap already exists in the image object, therefore the read operation would create a memory leak.", "Be sure to call imageClearBitmap before reading in a new image to avoid a memory leak.");
        KMC_ED_NONEXISTENT_FILE = new ErrorInfo("KMC_ED_NONEXISTENT_FILE", 68, 24582, "The file specified by the image file path in the image object does not exist.", "Specify a valid file path in the image object that exists in an area to which your app has access rights.");
        KMC_ED_FILE_NOT_DELETABLE = new ErrorInfo("KMC_ED_FILE_NOT_DELETABLE", 69, 24583, "The file specified by the image file path cannot be deleted.", "Specify a path to a file that your app and the OS has access rights to delete.");
        KMC_ED_FILE_STILL_REMAINS = new ErrorInfo("KMC_ED_FILE_STILL_REMAINS", 70, 24584, "The native file delete method did not delete the file from the file system, and the file still remains.", "The file path may be invalid, locked or you do not have write/read access rights to delete this file.");
        KMC_ED_MIMETYPE_MISMATCH = new ErrorInfo("KMC_ED_MIMETYPE_MISMATCH", 71, 24586, "The file specified by the image file path includes a file extension that does not match the mimetype.", "Specify a file path and file name extension to match the mimetype, for instance a file name image.tif with a TIFF mimetype.");
        KMC_ED_JPEG_BITDEPTH = new ErrorInfo("KMC_ED_JPEG_BITDEPTH", 72, 24587, "The image bits per pixel setting is invalid for a JPEG file.", "Specify an image bits per pixel setting of Grayscale or Color when writing to a JPEG file.");
        KMC_ED_FILE_EXISTS = new ErrorInfo("KMC_ED_FILE_EXISTS", 73, 24588, "The image file path specified for writing already exists, and the file contents would be lost.", "Make sure you delete the file before writing with the same file name to prevent data loss.");
        KMC_ED_IMAGE_IS_SCALED = new ErrorInfo("KMC_ED_IMAGE_IS_SCALED", 74, 24589, "The image bitmap was scaled, in order to fit in  available memory.", "The bitmap loaded was scaled down from its original size, in order to fit in to available memory.");
        KMC_ED_OBJECT_REP_BITMAP_MISMATCH = new ErrorInfo("KMC_ED_OBJECT_REP_BITMAP_MISMATCH", 75, 24590, "The image object bitmap is already defined, and setting the file name to an existing file violates the object contract.", "Don't overwrite or change the filename in the object after it is associated with an existing bitmap for this object.");
        KMC_ED_OBJECT_REP_FILE_MISMATCH = new ErrorInfo("KMC_ED_OBJECT_REP_FILE_MISMATCH", 76, 24591, "The image object is already defined, and changing the bitmap violates the object contract.", "Don't set the bitmap for the object after it already represented by a valid existing image file.");
        KMC_ED_INVALID_ISO_DATE_TIME_FORMAT = new ErrorInfo("KMC_ED_INVALID_ISO_DATE_TIME_FORMAT", 77, 24593, "The date specified does not represent a valid ISO 8601 date/time format.", "The date/time must correspond to the ISO 8601 international standard date/time format: YYYY-MM-DDThh:mm:ss.sTZD.");
        KMC_ED_INVALID_JPEG_QUALITY_VALUE = new ErrorInfo("KMC_ED_INVALID_JPEG_QUALITY_VALUE", 78, 24594, "The JPEG image quality value must be between 1 and 100.", "Specify a JPEG image quality value between 1 and 100.   Higher values indicate higher image quality but lower compression.");
        KMC_ED_BITMAP_WRITE_TO_FILE_FAILED = new ErrorInfo("KMC_ED_BITMAP_WRITE_TO_FILE_FAILED", 79, 24595, "The bitmap could not be written to the specified image file.", "Attempt to write a bitmap to an image file using specified MIME type and compression quality failed for unknown reasons.");
        KMC_ED_INVALID_DPI = new ErrorInfo("KMC_ED_INVALID_DPI", 80, 24596, "The DPI setting is invalid for this write operation.", "Set a valid DPI setting before writing the file.");
        KMC_ED_ALREADY_CLEAR = new ErrorInfo("KMC_ED_ALREADY_CLEAR", 81, 24597, "The image bitmap has already been cleared.", "This warning indicates you did not need to clear the bitmap when it was already cleared.");
        KMC_ED_ALTERNATE_FILEIO_ENGINE = new ErrorInfo("KMC_ED_ALTERNATE_FILEIO_ENGINE", 82, 24598, "An alternate File I/O engine was used in place of the preferred engine.", "The preferred File I/O engine is not compatible with the current File I/O property settings.  An alternate, compatible File I/O engine was used instead.");
        KMC_ED_BITMAP_READ_FROM_FILE_FAILED = new ErrorInfo("KMC_ED_BITMAP_READ_FROM_FILE_FAILED", 83, 24599, "The bitmap could not be read and decoded from the specified image file.", "Attempt to read and decode a bitmap from an image file failed for unknown reasons.");
        KMC_ED_IMAGE_WRITTEN_IS_NOT_BITONAL = new ErrorInfo("KMC_ED_IMAGE_WRITTEN_IS_NOT_BITONAL", 84, 24608, "The image was written in bitonal as requested, but the image was not actually a bitonal image. The output image quality may be poor because of image conversion.", "Specify the correct image file output color for the image to match its contents, mimetype and file type extension.");
        KMC_ED_IMAGE_WRITTEN_IS_NOT_GRAY = new ErrorInfo("KMC_ED_IMAGE_WRITTEN_IS_NOT_GRAY", 85, 24609, "The image was written in grayscale as requested, but the image was not actually a grayscale image.  The output image quality may be poor because of image conversion.", "Specify color output for this image, using the image file output color setting to match its contents, mimetype and file type extension.");
        KMC_ED_UNRECOGNIZED_MIME_TYPE = new ErrorInfo("KMC_ED_UNRECOGNIZED_MIME_TYPE", 86, 24611, "The Mime type of the specified image file path cannot be determined, or is unsupported.", "Make sure the image file specified is one of the supported Mime types:  TIFF, JPEG, PNG.");
        KMC_ED_BITMAP_DIMENSIONS_IMMUTABLE = new ErrorInfo("KMC_ED_BITMAP_DIMENSIONS_IMMUTABLE", 87, 24612, "The bitmap dimensions (width, height) cannot be set because this Image object is already represented by an immutable bitmap.", "Make sure the Image object representation is either IMAGE_REP_FILE or IMAGE_REP_UNKNOWN before attempting to specify bitmap dimensions.");
        KMC_ED_BITMAP_DIMENSIONS_NO_UPSCALE = new ErrorInfo("KMC_ED_BITMAP_DIMENSIONS_NO_UPSCALE", 88, 24613, "The bitmap dimensions (width, height) cannot be set larger than the original file-based representation of this Image object.", "Make sure the bitmap dimensions specified are smaller than those of the original file-based image representation.  Only bitmap downscaling is supported.");
        KMC_ED_IMAGE_FILE_DIMENSIONS_ERROR = new ErrorInfo("KMC_ED_IMAGE_FILE_DIMENSIONS_ERROR", 89, 24614, "The image file dimensions (width, height) cannot be determined.", "There was a problem attempting to read the image dimensions from the image file path contained in the Image object.  It can be caused by an invalid file type, or unsupported compression type.");
        KMC_ED_IMAGE_INVALID_SCALING_FACTOR = new ErrorInfo("KMC_ED_IMAGE_INVALID_SCALING_FACTOR", 90, 24615, "The scaling factor selected for this image object is invalid.", "The scaling factor supported for each image object is between 0.1 and 1.0.  A scaling factor of 1.0 means no scaling is performed.");
        KMC_ED_IMAGE_PERFECTION_PROFILE_EMPTY = new ErrorInfo("KMC_ED_IMAGE_PERFECTION_PROFILE_EMPTY", 91, 24616, "The ImagePerfectionProfile contains no image processing operations.", "Specify some image processing operations in the ipOperations property or ipOperationsFilePath property of the ImagePerfectionProfile.");
        KMC_ED_OBJECT_REP_NO_BITMAP = new ErrorInfo("KMC_ED_OBJECT_REP_NO_BITMAP", 92, 24617, "The current Image Representation does not include a bitmap.", "The operation requested requires an Image Representation which includes a bitmap.  The Image Representation should be either IMAGE_REP_BITMAP or IMAGE_REP_BOTH.");
        KMC_ED_BUFFER_EXISTS = new ErrorInfo("KMC_ED_BUFFER_EXISTS", 93, 24618, "The file buffer for writing already exists, and the buffer contents would be lost.", "Make sure you clear the file buffer before writing with the same bitmap to prevent data loss.");
        KMC_ED_BUFFER = new ErrorInfo("KMC_ED_BUFFER", 94, 24619, "The image object is missing a valid file buffer.", "Write the bitmap to a file buffer before calling the read file from buffer method.");
        KMC_ED_BUFFER_ALREADY_CLEARED = new ErrorInfo("KMC_ED_BUFFER_ALREADY_CLEARED", 95, 24620, "The file buffer has already been cleared.", "This warning indicates you did not need to clear the file buffer when it was already cleared.");
        KMC_ED_OBJECT_REP_MISMATCH = new ErrorInfo("KMC_ED_OBJECT_REP_MISMATCH", 96, 24621, "The object is already defined and represented, and changing to a buffered file is illegal in this state.", "Delete the file associated with the image, or write to a buffer after you specify the bitmap.");
        KMC_ED_ALREADY_BUFFERED = new ErrorInfo("KMC_ED_ALREADY_BUFFERED", 97, 24622, "Using this method such as setting a file name or reading from a file or buffer is not valid when the object is already represented by a buffered file.", "Set a file path or read from file after you create the image with a bitmap representation.");
        KMC_ED_DELETE_BUFFERED_FILE = new ErrorInfo("KMC_ED_DELETE_BUFFERED_FILE", 98, 24623, "The file representation is a buffered file, so you cannot use delete.", "Use clear buffer method to clear out the buffered file image.");
        KMC_ED_NO_MEMORY_FOR_BUFFERED_FILE = new ErrorInfo("KMC_ED_NO_MEMORY_FOR_BUFFERED_FILE", 99, 24624, "Could not allocate memory needed to store the buffered file image.", "Free up some memory and retry.");
        KMC_ED_BUFFERED_READ_FAILED = new ErrorInfo("KMC_ED_BUFFERED_READ_FAILED", 100, 24625, "Read from buffer failed because an image could not be generated from the buffered file image.", "Free up memory or change the buffered image format and retry.");
        KMC_ED_NO_BUFFERED_IMAGE = new ErrorInfo("KMC_ED_NO_BUFFERED_IMAGE", 101, 24626, "There is no buffered image from which to read while the image is in this image representation, or the file representation  is not FILE_BUFFERED.", "Make sure you use the buffer methods when the image object is in the correct state.");
        KMC_ED_INVALID_FOR_OBJECT_REP = new ErrorInfo("KMC_ED_INVALID_FOR_OBJECT_REP", 102, 24627, "This method (clear buffer or read buffer) is invalid based on the current image representation.", "Make sure you use the buffer methods when the image object is in the correct state.");
        KMC_ED_NONEXISTENT_LOAD_SETTINGS_FILE = new ErrorInfo("KMC_ED_NONEXISTENT_LOAD_SETTINGS_FILE", 103, 24628, "The settings file specified in the image perfection profile does not exist.", "The settings file must be a fully qualified path to a file that exists, and contains the commands that you want to perform.");
        KMC_ED_NONEXISTENT_OCR_REGION_TYPE = new ErrorInfo("KMC_ED_NONEXISTENT_OCR_REGION_TYPE", 104, 24629, "Region type should be set", "Set region type to pixel of percent of the image");
        KMC_UI_FLASH_AUTO_NOT_SUPPORTED = new ErrorInfo("KMC_UI_FLASH_AUTO_NOT_SUPPORTED", 105, 8193, "Flash mode AUTO is not supported with the camera hardware.", "Choose a different flash mode.");
        KMC_UI_FLASH_ON_NOT_SUPPORTED = new ErrorInfo("KMC_UI_FLASH_ON_NOT_SUPPORTED", 106, 8194, "Flash mode ON is not supported with the camera hardware.", "Choose a different flash mode.");
        KMC_UI_FLASH_OFF_NOT_SUPPORTED = new ErrorInfo("KMC_UI_FLASH_OFF_NOT_SUPPORTED", 107, 8195, "Flash mode OFF is not supported with the camera hardware.", "Choose a different flash mode.");
        KMC_UI_SCALING_FACTOR = new ErrorInfo("KMC_UI_SCALING_FACTOR", 108, 8196, "The scaling factor should be smaller for large images.", "Try another value.");
        KMC_UI_INVALID_THRESHOLD_ARGUMENT = new ErrorInfo("KMC_UI_INVALID_THRESHOLD_ARGUMENT", 109, 8197, "The threshold value is invalid.", "Please choose a value between 0 and 45.");
        KMC_UI_INVALID_DECLINATION_ARGUMENT = new ErrorInfo("KMC_UI_INVALID_DECLINATION_ARGUMENT", 110, 8198, "The declination value is invalid.", "Please choose a value between -180 and 180.");
        KMC_UI_INVALID_STABILITY_DELAY_ARGUMENT = new ErrorInfo("KMC_UI_INVALID_STABILITY_DELAY_ARGUMENT", 111, 8199, "The stability delay value is invalid.", "Please choose a value between 0 and 100.");
        KMC_UI_IMAGE_NULL = new ErrorInfo("KMC_UI_IMAGE_NULL", 112, 8200, "The image sent to the image edit and review control is empty.", "Please choose another image");
        KMC_UI_CAMERA_ALREADY_OPEN = new ErrorInfo("KMC_UI_CAMERA_ALREADY_OPEN", 113, 8201, "The camera cannot be opened, because it's already open.", "Internal SDK error:  Camera was not released prior to re-opening.");
        KMC_UI_CAMERA_OPERATION_FAILURE = new ErrorInfo("KMC_UI_CAMERA_OPERATION_FAILURE", 114, 8202, "Camera operation failed.", "Internal SDK error:  Camera media server died.");
        KMC_UI_CAMERA_LOCK_ACQUIRE_FAILURE = new ErrorInfo("KMC_UI_CAMERA_LOCK_ACQUIRE_FAILURE", 115, 8203, "The camera cannot be opened, because the Camera lock cannot be obtained.", "Internal SDK error:  CameraManager thread was interrupted while waiting for Camera lock.");
        KMC_UI_INVALID_AXIS_THRESHOLD_ARGUMENT = new ErrorInfo("KMC_UI_INVALID_AXIS_THRESHOLD_ARGUMENT", 116, 8204, "The threshold value is invalid.  Please choose a value between 0 and 100.", "A bad value was entered, try a valid value from 0 - 100.");
        KMC_UI_INVALID_PAGE_THRESHOLD_ARGUMENT = new ErrorInfo("KMC_UI_INVALID_PAGE_THRESHOLD_ARGUMENT", 117, 8205, "The threshold value is invalid.  Please choose a value between 0 and 100.", "A bad value was entered, try a valid value from 0 - 100.");
        KMC_UI_FOCUS_AREA_NOT_SUPPORTED = new ErrorInfo("KMC_UI_FOCUS_AREA_NOT_SUPPORTED", 118, 8206, "Custom focus areas are not supported on this device.", "Try fewer focus areas.");
        KMC_UI_FOCUS_AREA_COUNT = new ErrorInfo("KMC_UI_FOCUS_AREA_COUNT", 119, 8207, "Attempted to set an invalid number of focus areas.", "Try another value for the number of focus areas.");
        KMC_UI_FOCUS_AREA_EMPTY = new ErrorInfo("KMC_UI_FOCUS_AREA_EMPTY", 120, 8208, "Attempted to set a focus area with an empty or negative area.", "There must be at least one focus area.");
        KMC_UI_FLASH_TORCH_NOT_SUPPORTED = new ErrorInfo("KMC_UI_FLASH_TORCH_NOT_SUPPORTED", 121, 8209, "Flash mode TORCH is not supported with the camera hardware.", "Choose a different flash mode.");
        KMC_UI_INVALID_PADDING_PERCENTAGE_ARGUMENT = new ErrorInfo("KMC_UI_INVALID_PADDING_PERCENTAGE_ARGUMENT", 122, 8210, "The padding percentage is invalid.", "Please choose a value between 0 and 50.");
        KMC_UI_INVALID_ASPECT_RATIO_ARGUMENT = new ErrorInfo("KMC_UI_INVALID_ASPECT_RATIO_ARGUMENT", 123, 8211, "The aspect ratio is invalid.", "Please choose a positive value between 0 and 1");
        KMC_UI_INVALID_BORDER_THICKNESS_ARGUMENT = new ErrorInfo("KMC_UI_INVALID_BORDER_THICKNESS_ARGUMENT", 124, 8212, "The border thickness is invalid", "Please choose a value between 0 and 10.");
        KMC_UI_INVALID_WIDTH_ARGUMENT = new ErrorInfo("KMC_UI_INVALID_WIDTH_ARGUMENT", 125, 8213, "The width value is invalid", "Please choose a positive value greater than 0.");
        KMC_UI_INVALID_HEIGHT_ARGUMENT = new ErrorInfo("KMC_UI_INVALID_HEIGHT_ARGUMENT", 126, 8214, "The height value is invalid", "Please choose a positive value greater than 0.");
        KMC_UI_FOCUS_AREA_INVALID = new ErrorInfo("KMC_UI_FOCUS_AREA_INVALID", 127, 61463, "The Rect used for the focus area is invalid.", "Please specify a Rect that does not have zero area (e.g. is not a point, or line),  which right > left, and bottom > top.");
        KMC_UI_VIEW_NULL = new ErrorInfo("KMC_UI_VIEW_NULL", 128, 61464, "The view passed in was null.", "Please create a non-null instance of a IImageCaptureView, or pass in a non-null instance.");
        KMC_EV_MEMORY = new ErrorInfo("KMC_EV_MEMORY", 129, 57345, "Image processor memory could not be allocated", "");
        KMC_EV_FILEOPEN = new ErrorInfo("KMC_EV_FILEOPEN", 130, 57346, "Image processor could not open file", "");
        KMC_EV_BAD_DPI = new ErrorInfo("KMC_EV_BAD_DPI", 131, 57347, "Image processor detected invalid DPI", "");
        KMC_EV_BAD_WIDTH_HEIGHT = new ErrorInfo("KMC_EV_BAD_WIDTH_HEIGHT", 132, 57348, "Image processor detected invalid height or width", "");
        KMC_EV_BAD_LINEWIDTH = new ErrorInfo("KMC_EV_BAD_LINEWIDTH", 133, 57349, "Image processor detected in invalid line width", "");
        KMC_EV_BAD_CHANNEL = new ErrorInfo("KMC_EV_BAD_CHANNEL", 134, 57350, "Image processor detected an illegal channel depth specified", "");
        KMC_EV_METADATA_OVERFLOW = new ErrorInfo("KMC_EV_METADATA_OVERFLOW", 135, 57351, "Image processor could not save the metadata in the limited output buffer", "");
        KMC_EV_FILE_READ_FAILED = new ErrorInfo("KMC_EV_FILE_READ_FAILED", 136, 57352, "Image processor detected file read error", "");
        KMC_EV_IMAGE_PARM = new ErrorInfo("KMC_EV_IMAGE_PARM", 137, 57353, "Image processor detected an illegal parameter", "");
        KMC_EV_IMAGE_PROCESSING = new ErrorInfo("KMC_EV_IMAGE_PROCESSING", 138, 57354, "Image processor could not process the image", "");
        KMC_EV_IMAGE_WRITE_FAILED = new ErrorInfo("KMC_EV_IMAGE_WRITE_FAILED", 139, 57355, "Image processor could not write the image", "");
        KMC_EV_UNKNOWN_FILETYPE = new ErrorInfo("KMC_EV_UNKNOWN_FILETYPE", 140, 57356, "Image processor detected an unknown file type", "");
        KMC_EV_NONEXISTANT_IMAGE = new ErrorInfo("KMC_EV_NONEXISTANT_IMAGE", 141, 57357, "Image processor detected a nonexistent image", "");
        KMC_EV_BAD_FILE_FORMAT = new ErrorInfo("KMC_EV_BAD_FILE_FORMAT", 142, 57358, "Image processor detected an illegal internal file format", "");
        KMC_EV_APPEND_TO_FILE = new ErrorInfo("KMC_EV_APPEND_TO_FILE", 143, 57359, "Image processor could not append to the file specified", "");
        KMC_EV_CANNOT_APPEND = new ErrorInfo("KMC_EV_CANNOT_APPEND", 144, 57360, "Image processor cannot append to the file type specified", "");
        KMC_EV_PDF_BAD = new ErrorInfo("KMC_EV_PDF_BAD", 145, 57361, "Image processor detected a bad PDF file", "");
        KMC_EV_APPEND_ENCRYPTED = new ErrorInfo("KMC_EV_APPEND_ENCRYPTED", 146, 57362, "Image processor detected an encryption appending issue", "");
        KMC_EV_PDF_TOO_LARGE = new ErrorInfo("KMC_EV_PDF_TOO_LARGE", 147, 57363, "Image processor detected the PDF file is too large to append to", "");
        KMC_EV_SPEED_ACCURACY = new ErrorInfo("KMC_EV_SPEED_ACCURACY", 148, 57364, "Image processor detected a speed accuracy issue", "");
        KMC_EV_NETWORK_READ = new ErrorInfo("KMC_EV_NETWORK_READ", 149, 57365, "Image processor detected error reading from the network", "");
        KMC_EV_FILE_METADATA = new ErrorInfo("KMC_EV_FILE_METADATA", 150, 57366, "Image processor detected a file metadata issue", "");
        KMC_EV_INVALID_HANDLE = new ErrorInfo("KMC_EV_INVALID_HANDLE", 151, 57367, "Image processor detected a bad handle", "");
        KMC_EV_EXTERNAL_PAGE = new ErrorInfo("KMC_EV_EXTERNAL_PAGE", 152, 57368, "Image processor detected a bad external page", "");
        KMC_EV_MMX_PROCESSING = new ErrorInfo("KMC_EV_MMX_PROCESSING", 153, 57369, "Image processor detected a MMX processing issue", "");
        KMC_EV_HISTOGRAM = new ErrorInfo("KMC_EV_HISTOGRAM", 154, 57370, "Image processor detected a bad histogram", "");
        KMC_EV_INVALID_POINTER = new ErrorInfo("KMC_EV_INVALID_POINTER", 155, 57371, "Image processor detected an illegal pointer", "");
        KMC_EV_PAPER_SIZE = new ErrorInfo("KMC_EV_PAPER_SIZE", 156, 57372, "Image processor detected an illegal paper sized", "");
        KMC_EV_BARCODE_DRIVER = new ErrorInfo("KMC_EV_BARCODE_DRIVER", 157, 57373, "Image processor bar code driver failure", "");
        KMC_EV_LICENSING = new ErrorInfo("KMC_EV_LICENSING", 158, 57374, "Kofax Mobile SDK detected an invalid license", "");
        KMC_EV_LICENSE_EXPIRED = new ErrorInfo("KMC_EV_LICENSE_EXPIRED", 159, 57375, "Your Kofax Mobile SDK license has expired", "");
        KMC_EV_LOCK_CREATION_ERROR = new ErrorInfo("KMC_EV_LOCK_CREATION_ERROR", 160, 57376, "EVRS could not create lock for thread safe operation.", "Failed to create system mutex used for thread safe operation. System error.");
        KMC_EV_FILE_IO_ACCESS_BUSY = new ErrorInfo("KMC_EV_FILE_IO_ACCESS_BUSY", 161, 57377, "Image processor is busy for file IO access", "Another thread is calling the image processor for file IO access operation. Application can either retry after certain period of time, or cancel the operation.");
        KMC_EV_PROCESS_PAGE_BUSY = new ErrorInfo("KMC_EV_PROCESS_PAGE_BUSY", 162, 57378, "Image processor is busy for page process", "Another thread is calling the image processor for page process operation. Application can either retry after certain period of time, or cancel the operation.");
        KMC_EV_LICENSE_ALREADY_SET = new ErrorInfo("KMC_EV_LICENSE_ALREADY_SET", 163, 57385, "Your Kofax Mobile SDK license has already been set", "");
        KMC_EV_CANCEL_OPERATION_SUCCESS = new ErrorInfo("KMC_EV_CANCEL_OPERATION_SUCCESS", 164, 57386, "Image processor processing cancelled", "User has successfully aborted or cancelled image processing");
        KMC_IP_NO_PROFILE = new ErrorInfo("KMC_IP_NO_PROFILE", 165, 20481, "The engine does not have any profile specified.", "You must set either a basic settings profile or an image perfection profile before calling the image processor.");
        KMC_IP_NO_REPRESENTATION = new ErrorInfo("KMC_IP_NO_REPRESENTATION", 166, 20482, "The input image object has no active representation for File, Bitmap or both.", "You must specify an initialized image object that refers to an image in memory or in a file, so that the image can be processed.");
        KMC_IP_LICENSE_INVALID = new ErrorInfo("KMC_IP_LICENSE_INVALID", 167, 20484, "The string is not valid for requesting a library license.", "Specify a valid license string that you obtain from Kofax.");
        KMC_IP_LICENSE_EXPIRED = new ErrorInfo("KMC_IP_LICENSE_EXPIRED", 168, 20485, "The current date exceeds end date limit enforced by the license.", "Contact Kofax to obtain a new VRS license.");
        KMC_IP_LICENSE_ALREADY_SET = new ErrorInfo("KMC_IP_LICENSE_ALREADY_SET", 169, 20486, "Your Kofax Mobile SDK license has already been set.", "");
        KMC_IP_FILE_AND_BUFFERED_REPRESENTATION = new ErrorInfo("KMC_IP_FILE_AND_BUFFERED_REPRESENTATION", 170, 20489, "File based buffered representation is not valid.", "Please try another representation.");
        KMC_CL_CONFIG_NULL = new ErrorInfo("KMC_CL_CONFIG_NULL", 171, 49153, "The classification configuration file path is null.", "The file path for the image classification configuration file is empty.");
        KMC_CL_CONFIG_NOT_LOADED = new ErrorInfo("KMC_CL_CONFIG_NOT_LOADED", 172, 49154, "The classification configuration file was not loaded.", "You must call the loadConfigurationFile method with a valid classification configuration file before an image can be classified.");
        KMC_CL_MODEL_NULL = new ErrorInfo("KMC_CL_MODEL_NULL", 173, 49155, "The classification model file path is null.", "The file path for the image classification model file is null or empty.");
        KMC_CL_MODEL_NOT_LOADED = new ErrorInfo("KMC_CL_MODEL_NOT_LOADED", 174, 49156, "The classification model file was not loaded.", "You must call the loadModel method with a valid classification model file before an image can be classified.");
        KMC_CL_LISTENER_NULL = new ErrorInfo("KMC_CL_LISTENER_NULL", 175, 49157, "The image classification listener is null.", "The object referenced to be used as a listener for the image classification completed event is null.");
        KMC_CL_MAX_NUM_RESULTS_INVALID = new ErrorInfo("KMC_CL_MAX_NUM_RESULTS_INVALID", 176, 49158, "The maximum number of results value is invalid.", "Please choose a value between 1 and 64.");
        KMC_CL_CLASSIFIER_BUSY = new ErrorInfo("KMC_CL_CLASSIFIER_BUSY", 177, 49159, "The image classification process is busy.", "The image classification process is working on another request.");
        KMC_CL_CLASSIFIER_NOT_INITIALIZED = new ErrorInfo("KMC_CL_CLASSIFIER_NOT_INITIALIZED", 178, 49160, "The image classifier is not initialized.", "The image classification object requires the configuration and model files to be loaded before an image can be classified.");
        KMC_CL_INVALID_IMAGE_SUPPLIED = new ErrorInfo("KMC_CL_INVALID_IMAGE_SUPPLIED", 179, 49161, "The image used for classification is invalid.", "The image used for classification is not valid.");
        KMC_CL_NO_IMAGE_SUPPLIED = new ErrorInfo("KMC_CL_NO_IMAGE_SUPPLIED", 180, 49162, "No image was supplied for classification.", "No image was supplied for classification.");
        KMC_UT_STATS_RECORDING_NOT_OFF = new ErrorInfo("KMC_UT_STATS_RECORDING_NOT_OFF", 181, 61441, "Recording not off", "Please stop recording using the stopRecord method.");
        KMC_UT_STATS_FILEPATH_IS_NULL = new ErrorInfo("KMC_UT_STATS_FILEPATH_IS_NULL", 182, 61442, "Filepath is missing", "The file path to datastore has not been set.");
        KMC_UT_STATS_EXPORT_HANDLER_MISSING = new ErrorInfo("KMC_UT_STATS_EXPORT_HANDLER_MISSING", 183, 61443, "Export handler is missing", "Please use the register method to pass in a handler.");
        KMC_UT_STATS_NOTHING_TO_PURGE = new ErrorInfo("KMC_UT_STATS_NOTHING_TO_PURGE", 184, 61444, "The datastore is empty", "Call startRecord to populate the datastore.");
        KMC_UT_STATS_INIT_NOT_ALLOWED = new ErrorInfo("KMC_UT_STATS_INIT_NOT_ALLOWED", 185, 61445, "Initializing AppStatistics is not allowed from this AppStats state.", "You should stop recording, writing, and exporting before attempting to initialize.");
        KMC_UT_STATS_PURGE_NOT_ALLOWED = new ErrorInfo("KMC_UT_STATS_PURGE_NOT_ALLOWED", 186, 61446, "Purging AppStatistics is not allowed from this AppStats state.", "You should stop recording, writing, and exporting before attempting to purge.");
        KMC_UT_STATS_EXPORT_NOT_ALLOWED = new ErrorInfo("KMC_UT_STATS_EXPORT_NOT_ALLOWED", 187, 61447, "Exporting from AppStatistics is not allowed from this AppStats state.", "You should stop recording and writing before attempting to export.");
        KMC_UT_STATS_RECORD_NOT_ALLOWED = new ErrorInfo("KMC_UT_STATS_RECORD_NOT_ALLOWED", 188, 61448, "Recording AppStats events is not allowed from this AppStats state.", "You should stop exporting before attempting to record.");
        KMC_UT_STATS_WRITING_NOT_ALLOWED = new ErrorInfo("KMC_UT_STATS_WRITING_NOT_ALLOWED", 189, 61449, "Writing AppStats events is not allowed from this AppStats state.", "You should stop exporting before attempting to write.");
        KMC_UT_STATS_ALREADY_RECORDING = new ErrorInfo("KMC_UT_STATS_ALREADY_RECORDING", 190, 61450, "AppStats events recording is already enabled.", "It's more efficient to start recording only after it has been stopped.");
        KMC_UT_STATS_ALREADY_EXPORTING = new ErrorInfo("KMC_UT_STATS_ALREADY_EXPORTING", 191, 61451, "AppStats is already in the process of exporting.", "You should wait for the current export to complete, before starting a new one.");
        KMC_UT_STATS_ALREADY_WRITING = new ErrorInfo("KMC_UT_STATS_ALREADY_WRITING", 192, 61452, "AppStats is already in the process of writing.", "You should wait for the current write to complete, before starting a new one.");
        KMC_UT_STATS_UNINITIALIZED = new ErrorInfo("KMC_UT_STATS_UNINITIALIZED", 193, 61453, "The requested operation cannot be started because the AppStats object has not been initialized", "Call the initAppStats method before attempting other AppStats operations.");
        KMC_UT_STATS_STATE_BUSY = new ErrorInfo("KMC_UT_STATS_STATE_BUSY", 194, 61454, "The requested operation cannot be started because the AppStats state is transitioning as a result of an earlier request.", "Wait for the previous operation to complete, before attempting to start a new operation.");
        KMC_UT_STATS_INVALID_STATE_TRANSITION = new ErrorInfo("KMC_UT_STATS_INVALID_STATE_TRANSITION", 195, 61455, "Attempt to transition from one AppStats State to a subsequent AppStats State, where the target State is not reachable from the current State.", "Internal unexpected error.  No recommendation.");
        KMC_UT_STATS_RECORD_AND_WRITING_NOT_ALLOWED = new ErrorInfo("KMC_UT_STATS_RECORD_AND_WRITING_NOT_ALLOWED", 196, 61462, "Recording and writing AppStats events is not allowed from this AppStats state.", "You should stop exporting before attempting to record and write.");
        KMC_UT_STATS_EVENT_THROTTLED = new ErrorInfo("KMC_UT_STATS_EVENT_THROTTLED", 197, 61463, "Elapsed time between AppStats events is less than configured throttling time.  Event not recorded.", "Wait until the minimum throttle time has elpased before recording the next event.");
        KMC_UT_STATS_NOTHING_TO_EXPORT = new ErrorInfo("KMC_UT_STATS_NOTHING_TO_EXPORT", 198, 61464, "The datastore is empty: there are no AppStats event to export.", "Call startRecord to log some AppStats events in the datastore before attempting to export them.");
        KMC_UT_STATS_INVALID_JSON = new ErrorInfo("KMC_UT_STATS_INVALID_JSON", 199, 61465, "Attempt to construct a malformed JSON document while exporting AppStats data.", "Internal unexpected error.  No recommendation.");
        KMC_UT_STATS_RECORDING_NOT_ON = new ErrorInfo("KMC_UT_STATS_RECORDING_NOT_ON", 200, 61466, "AppStats Recording not on.", "Please start recording using the AppStatistics startRecord method.");
        KMC_UT_STATS_DATASTORE_OUT_OF_DATE = new ErrorInfo("KMC_UT_STATS_DATASTORE_OUT_OF_DATE", 201, 61467, "AppStats cannot be initialized because the datastore is out-of-date.", "Please purge the old datastore, or use the upgradeSchema() method.");
        KMC_UT_STATS_DATASTORE_UPGRADE_FAILED = new ErrorInfo("KMC_UT_STATS_DATASTORE_UPGRADE_FAILED", 202, 61468, "AppStats cannot upgrade the existing datastore to the current schema.", "Please make sure the existing datastore is one created by an earlier version of AppStats.");
        KMC_UT_STATS_DATASTORE_NO_UPGRADE_PATH = new ErrorInfo("KMC_UT_STATS_DATASTORE_NO_UPGRADE_PATH", 203, 61469, "AppStats cannot upgrade the datastore because the existing version has no upgrade path.", "Internal unexpected error.  No recommendation.");
        KMC_UT_STATS_DATASTORE_UPGRADE_NOT_NEEDED = new ErrorInfo("KMC_UT_STATS_DATASTORE_UPGRADE_NOT_NEEDED", 204, 61470, "AppStats cannot upgrade the datastore because the current version is up-to-date.", "There's no need to upgrade a datastore which already implements the current schema.");
        KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE = new ErrorInfo("KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE", 205, 61471, "Upgrade not allowed when AppStats is already initialized.", "AppStats must be in an uninitialized state in order to perform an upgrade.");
        KMC_UT_STATS_DATASTORE_UPGRADE_MISSING_FILE = new ErrorInfo("KMC_UT_STATS_DATASTORE_UPGRADE_MISSING_FILE", 206, 61472, "AppStats cannot upgrade the datastore because the file does not exist.", "Please make sure the datastore file exists before attempting to upgrade it.");
        KMC_UT_STATS_LOG_SESSION_EVENT_NOT_ALLOWED = new ErrorInfo("KMC_UT_STATS_LOG_SESSION_EVENT_NOT_ALLOWED", 207, 61473, "Logging an AppStats session event is not allowed from this AppStats state.", "You must start recording first in order to log an AppStats session event.");
        KMC_UT_STATS_DEVICE_ID_MISSING = new ErrorInfo("KMC_UT_STATS_DEVICE_ID_MISSING", 208, 61474, "User must specify device ID as a GUID or string using setDeviceID method.", "Please call setDeviceID method before init method in AppStats.");
        KMC_UT_STATS_NO_SESSION_BEGUN = new ErrorInfo("KMC_UT_STATS_NO_SESSION_BEGUN", 209, 61476, "You must begin an AppStats session before attempting to record a session event or end a session.", "Call the beginSession method prior to calling logSessionEvent.  Call startSession prior to calling endSession.");
        KMC_UT_STATS_BEGIN_SESSION_NOT_ALLOWED = new ErrorInfo("KMC_UT_STATS_BEGIN_SESSION_NOT_ALLOWED", 210, 61477, "Beginning an AppStats session is not allowed from this AppStats state.", "You must start recording first in order to start a new AppStats session.");
        KMC_UT_STATS_SESSION_ALREADY_BEGUN = new ErrorInfo("KMC_UT_STATS_SESSION_ALREADY_BEGUN", 211, 61478, "You are attempting to begin a new AppStats session when one has already begun.", "Call the endSession method prior to calling beginSession.");
        KMC_UT_STATS_END_SESSION_NOT_ALLOWED = new ErrorInfo("KMC_UT_STATS_END_SESSION_NOT_ALLOWED", 212, 61479, "Ending an AppStats session is not allowed from this AppStats state.", "You must start recording first in order to end an AppStats session.");
        KMC_BC_NONE = new ErrorInfo("KMC_BC_NONE", 213, 45057, "", "");
        KMC_BC_UNKNOWN = new ErrorInfo("KMC_BC_UNKNOWN", 214, 45058, "There was an unknown error with the barcode reader engine.", "");
        KMC_BC_IMAGE_BUFFERED = new ErrorInfo("KMC_BC_IMAGE_BUFFERED", 215, 45060, "File based buffered representation is not valid.", "Either use a stored file, or an image in memory.");
        KMC_BC_NO_REPRESENTATION = new ErrorInfo("KMC_BC_NO_REPRESENTATION", 216, 45063, "The input image object has no active representation for File, Bitmap or both.", "Ensure input image has an in-memory representation that is scaled down, or an unbuffered file representation before reading bar codes.");
        KMC_BC_INVALID_IMAGE = new ErrorInfo("KMC_BC_INVALID_IMAGE", 217, 45064, "The image contained bad image data, is null, or was otherwise invalid.", "Retake the image, or try scanning for bar codes with a different image.");
        KMC_BC_BUSY = new ErrorInfo("KMC_BC_BUSY", 218, 45065, "A read operation is already in progress.", "You cannot call readBarcodes while a read operation is already in progress; only one outstanding read operation can be running at a time");
        KMC_OCR_INVALID_BITMAP_SIZE = new ErrorInfo("KMC_OCR_INVALID_BITMAP_SIZE", 219, 1, "Image size selected for cropping is invalid", "The image size should be less than original image");
        f = (new ErrorInfo[] {
            KMC_SUCCESS, KMC_GN_FILE_NOT_FOUND, KMC_GN_OUT_OF_MEMORY, KMC_GN_UNKNOWN_ERROR, KMC_GN_PARAM_NEGATIVE, KMC_GN_UNSUPPORTED_OPERATION, KMC_GN_BAD_APPLICATION_CONTEXT, KMC_GN_DESERIALIZE_VERSION_ERROR, KMC_GN_DESERIALIZE_OBJECT_ERROR, KMC_GN_SESSION_CREATE_ERROR, 
            KMC_GN_SESSION_DISMISS_ERROR, KMC_GN_NULL_POINTER_EXCEPTION, KMC_GN_IO_EXCEPTION, KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION, KMC_GN_INTERNAL_ERROR, KMC_GN_ILLEGAL_THREAD_STATE_EXCEPTION, KMC_GN_FILE_NOT_FOUND_EXCEPTION, KMC_LO_INVALID_SERVER_URL, KMC_LO_SERVER_URL_NOT_SET, KMC_LO_USERNAME_NOT_SET, 
            KMC_LO_USER_ALREADY_LOGGED_IN, KMC_LO_USER_NOT_LOGGED_IN_ON_LOGOUT, KMC_LO_USER_LOGGING_IN_ON_LOGIN, KMC_LO_USER_ALREADY_LOGGED_OUT, KMC_LO_USER_LOGGING_OUT_ON_LOGOUT, KMC_LO_DEVICE_REG_LICENSING_ERROR, KMC_LO_SESSION_STATE_BUSY, KMC_LO_USER_LOGIN_ERROR, KMC_LO_PAGE_NOT_FOUND, KMC_LO_IMAGE_NOT_FOUND, 
            KMC_LO_DOMAIN, KMC_LO_EMAIL, KMC_LO_NOT_REGISTERED, KMC_LO_REGISTERING, KMC_LO_OVERLAPPED_OPERATIONS, KMC_LO_INVALID_SESSION_STATE, KMC_LO_LOGIN_NOT_ALLOWED, KMC_LO_NOT_LOGGED_IN, KMC_LO_USER_LOGOUT_ERROR, KMC_LO_TASK_LOCK_ACQUIRE_ERROR, 
            KMC_LO_NO_OPERATION_TO_CANCEL, KMC_LO_OPERATION_NOT_CANCELLABLE, KMC_LO_OPERATION_CANCELLED, KMC_LO_INVALID_DOCUMENT_TYPE_NAME, KMC_LO_DOWNLOAD_DOCUMENT_FIELDS_ERROR, KMC_LO_SUBMIT_PNG, KMC_LO_SUBMIT_BITMAP, KMC_LO_START_SUBMIT_JOB_ERROR, KMC_LO_SUBMIT_DOCUMENT_IMAGES_ERROR, KMC_LO_START_SUBMIT_INVALID_JOB_ID, 
            KMC_LO_SUBMIT_DOCUMENT_FILEIO_ERROR, KMC_LO_SUBMIT_DOCUMENT_FILE_CLOSE_ERROR, KMC_LO_SUBMIT_DOCUMENT_NO_IMAGE_ERROR, KMC_LO_PAGE_IMAGE_INDEX_INVALID, KMC_LO_SUBMIT_DOCUMENT_MIMETYPE_ERROR, KMC_LO_SUBMIT_DOCUMENT_IMAGE_REP_ERROR, KMC_LO_SUBMIT_DOCUMENT_IMAGE_FILE_MISSING, KMC_LO_OPERATION_CANCEL_ERROR, KMC_LO_INVALID_SESSION_STATE_TRANSITION, KMC_LO_REGISTERING_NOT_ALLOWED, 
            KMC_LO_DOWNLOAD_DOCUMENT_SCAN_SETTINGS_ERROR, KMC_LO_EVENT_LOCK_ACQUIRE_ERROR, KMC_LO_REQUEST_TIMEOUT, KMC_LO_SERVER_TIMEOUT, KMC_ED_FILEPATH, KMC_ED_MIMETYPE, KMC_ED_NOIMAGE, KMC_ED_IMAGELEAK, KMC_ED_NONEXISTENT_FILE, KMC_ED_FILE_NOT_DELETABLE, 
            KMC_ED_FILE_STILL_REMAINS, KMC_ED_MIMETYPE_MISMATCH, KMC_ED_JPEG_BITDEPTH, KMC_ED_FILE_EXISTS, KMC_ED_IMAGE_IS_SCALED, KMC_ED_OBJECT_REP_BITMAP_MISMATCH, KMC_ED_OBJECT_REP_FILE_MISMATCH, KMC_ED_INVALID_ISO_DATE_TIME_FORMAT, KMC_ED_INVALID_JPEG_QUALITY_VALUE, KMC_ED_BITMAP_WRITE_TO_FILE_FAILED, 
            KMC_ED_INVALID_DPI, KMC_ED_ALREADY_CLEAR, KMC_ED_ALTERNATE_FILEIO_ENGINE, KMC_ED_BITMAP_READ_FROM_FILE_FAILED, KMC_ED_IMAGE_WRITTEN_IS_NOT_BITONAL, KMC_ED_IMAGE_WRITTEN_IS_NOT_GRAY, KMC_ED_UNRECOGNIZED_MIME_TYPE, KMC_ED_BITMAP_DIMENSIONS_IMMUTABLE, KMC_ED_BITMAP_DIMENSIONS_NO_UPSCALE, KMC_ED_IMAGE_FILE_DIMENSIONS_ERROR, 
            KMC_ED_IMAGE_INVALID_SCALING_FACTOR, KMC_ED_IMAGE_PERFECTION_PROFILE_EMPTY, KMC_ED_OBJECT_REP_NO_BITMAP, KMC_ED_BUFFER_EXISTS, KMC_ED_BUFFER, KMC_ED_BUFFER_ALREADY_CLEARED, KMC_ED_OBJECT_REP_MISMATCH, KMC_ED_ALREADY_BUFFERED, KMC_ED_DELETE_BUFFERED_FILE, KMC_ED_NO_MEMORY_FOR_BUFFERED_FILE, 
            KMC_ED_BUFFERED_READ_FAILED, KMC_ED_NO_BUFFERED_IMAGE, KMC_ED_INVALID_FOR_OBJECT_REP, KMC_ED_NONEXISTENT_LOAD_SETTINGS_FILE, KMC_ED_NONEXISTENT_OCR_REGION_TYPE, KMC_UI_FLASH_AUTO_NOT_SUPPORTED, KMC_UI_FLASH_ON_NOT_SUPPORTED, KMC_UI_FLASH_OFF_NOT_SUPPORTED, KMC_UI_SCALING_FACTOR, KMC_UI_INVALID_THRESHOLD_ARGUMENT, 
            KMC_UI_INVALID_DECLINATION_ARGUMENT, KMC_UI_INVALID_STABILITY_DELAY_ARGUMENT, KMC_UI_IMAGE_NULL, KMC_UI_CAMERA_ALREADY_OPEN, KMC_UI_CAMERA_OPERATION_FAILURE, KMC_UI_CAMERA_LOCK_ACQUIRE_FAILURE, KMC_UI_INVALID_AXIS_THRESHOLD_ARGUMENT, KMC_UI_INVALID_PAGE_THRESHOLD_ARGUMENT, KMC_UI_FOCUS_AREA_NOT_SUPPORTED, KMC_UI_FOCUS_AREA_COUNT, 
            KMC_UI_FOCUS_AREA_EMPTY, KMC_UI_FLASH_TORCH_NOT_SUPPORTED, KMC_UI_INVALID_PADDING_PERCENTAGE_ARGUMENT, KMC_UI_INVALID_ASPECT_RATIO_ARGUMENT, KMC_UI_INVALID_BORDER_THICKNESS_ARGUMENT, KMC_UI_INVALID_WIDTH_ARGUMENT, KMC_UI_INVALID_HEIGHT_ARGUMENT, KMC_UI_FOCUS_AREA_INVALID, KMC_UI_VIEW_NULL, KMC_EV_MEMORY, 
            KMC_EV_FILEOPEN, KMC_EV_BAD_DPI, KMC_EV_BAD_WIDTH_HEIGHT, KMC_EV_BAD_LINEWIDTH, KMC_EV_BAD_CHANNEL, KMC_EV_METADATA_OVERFLOW, KMC_EV_FILE_READ_FAILED, KMC_EV_IMAGE_PARM, KMC_EV_IMAGE_PROCESSING, KMC_EV_IMAGE_WRITE_FAILED, 
            KMC_EV_UNKNOWN_FILETYPE, KMC_EV_NONEXISTANT_IMAGE, KMC_EV_BAD_FILE_FORMAT, KMC_EV_APPEND_TO_FILE, KMC_EV_CANNOT_APPEND, KMC_EV_PDF_BAD, KMC_EV_APPEND_ENCRYPTED, KMC_EV_PDF_TOO_LARGE, KMC_EV_SPEED_ACCURACY, KMC_EV_NETWORK_READ, 
            KMC_EV_FILE_METADATA, KMC_EV_INVALID_HANDLE, KMC_EV_EXTERNAL_PAGE, KMC_EV_MMX_PROCESSING, KMC_EV_HISTOGRAM, KMC_EV_INVALID_POINTER, KMC_EV_PAPER_SIZE, KMC_EV_BARCODE_DRIVER, KMC_EV_LICENSING, KMC_EV_LICENSE_EXPIRED, 
            KMC_EV_LOCK_CREATION_ERROR, KMC_EV_FILE_IO_ACCESS_BUSY, KMC_EV_PROCESS_PAGE_BUSY, KMC_EV_LICENSE_ALREADY_SET, KMC_EV_CANCEL_OPERATION_SUCCESS, KMC_IP_NO_PROFILE, KMC_IP_NO_REPRESENTATION, KMC_IP_LICENSE_INVALID, KMC_IP_LICENSE_EXPIRED, KMC_IP_LICENSE_ALREADY_SET, 
            KMC_IP_FILE_AND_BUFFERED_REPRESENTATION, KMC_CL_CONFIG_NULL, KMC_CL_CONFIG_NOT_LOADED, KMC_CL_MODEL_NULL, KMC_CL_MODEL_NOT_LOADED, KMC_CL_LISTENER_NULL, KMC_CL_MAX_NUM_RESULTS_INVALID, KMC_CL_CLASSIFIER_BUSY, KMC_CL_CLASSIFIER_NOT_INITIALIZED, KMC_CL_INVALID_IMAGE_SUPPLIED, 
            KMC_CL_NO_IMAGE_SUPPLIED, KMC_UT_STATS_RECORDING_NOT_OFF, KMC_UT_STATS_FILEPATH_IS_NULL, KMC_UT_STATS_EXPORT_HANDLER_MISSING, KMC_UT_STATS_NOTHING_TO_PURGE, KMC_UT_STATS_INIT_NOT_ALLOWED, KMC_UT_STATS_PURGE_NOT_ALLOWED, KMC_UT_STATS_EXPORT_NOT_ALLOWED, KMC_UT_STATS_RECORD_NOT_ALLOWED, KMC_UT_STATS_WRITING_NOT_ALLOWED, 
            KMC_UT_STATS_ALREADY_RECORDING, KMC_UT_STATS_ALREADY_EXPORTING, KMC_UT_STATS_ALREADY_WRITING, KMC_UT_STATS_UNINITIALIZED, KMC_UT_STATS_STATE_BUSY, KMC_UT_STATS_INVALID_STATE_TRANSITION, KMC_UT_STATS_RECORD_AND_WRITING_NOT_ALLOWED, KMC_UT_STATS_EVENT_THROTTLED, KMC_UT_STATS_NOTHING_TO_EXPORT, KMC_UT_STATS_INVALID_JSON, 
            KMC_UT_STATS_RECORDING_NOT_ON, KMC_UT_STATS_DATASTORE_OUT_OF_DATE, KMC_UT_STATS_DATASTORE_UPGRADE_FAILED, KMC_UT_STATS_DATASTORE_NO_UPGRADE_PATH, KMC_UT_STATS_DATASTORE_UPGRADE_NOT_NEEDED, KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE, KMC_UT_STATS_DATASTORE_UPGRADE_MISSING_FILE, KMC_UT_STATS_LOG_SESSION_EVENT_NOT_ALLOWED, KMC_UT_STATS_DEVICE_ID_MISSING, KMC_UT_STATS_NO_SESSION_BEGUN, 
            KMC_UT_STATS_BEGIN_SESSION_NOT_ALLOWED, KMC_UT_STATS_SESSION_ALREADY_BEGUN, KMC_UT_STATS_END_SESSION_NOT_ALLOWED, KMC_BC_NONE, KMC_BC_UNKNOWN, KMC_BC_IMAGE_BUFFERED, KMC_BC_NO_REPRESENTATION, KMC_BC_INVALID_IMAGE, KMC_BC_BUSY, KMC_OCR_INVALID_BITMAP_SIZE
        });
    }
}
