// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package net.hockeyapp.android:
//            StringListener

public class Strings
{

    public static final int CRASH_DIALOG_MESSAGE_ID = 1;
    public static final int CRASH_DIALOG_NEGATIVE_BUTTON_ID = 2;
    public static final int CRASH_DIALOG_NEUTRAL_BUTTON_ID = 3;
    public static final int CRASH_DIALOG_POSITIVE_BUTTON_ID = 4;
    public static final int CRASH_DIALOG_TITLE_ID = 0;
    private static final Map DEFAULT;
    public static final int DOWNLOAD_FAILED_DIALOG_MESSAGE_ID = 257;
    public static final int DOWNLOAD_FAILED_DIALOG_NEGATIVE_BUTTON_ID = 258;
    public static final int DOWNLOAD_FAILED_DIALOG_POSITIVE_BUTTON_ID = 259;
    public static final int DOWNLOAD_FAILED_DIALOG_TITLE_ID = 256;
    public static final int EXPIRY_INFO_TEXT_ID = 769;
    public static final int EXPIRY_INFO_TITLE_ID = 768;
    public static final int FEEDBACK_ATTACHMENT_BUTTON_TEXT_ID = 1031;
    public static final int FEEDBACK_EMAIL_INPUT_HINT_ID = 1027;
    public static final int FEEDBACK_FAILED_TEXT_ID = 1025;
    public static final int FEEDBACK_FAILED_TITLE_ID = 1024;
    public static final int FEEDBACK_GENERIC_ERROR_ID = 1040;
    public static final int FEEDBACK_LAST_UPDATED_TEXT_ID = 1030;
    public static final int FEEDBACK_MESSAGE_INPUT_HINT_ID = 1029;
    public static final int FEEDBACK_NAME_INPUT_HINT_ID = 1026;
    public static final int FEEDBACK_REFRESH_BUTTON_TEXT_ID = 1034;
    public static final int FEEDBACK_RESPONSE_BUTTON_TEXT_ID = 1033;
    public static final int FEEDBACK_SEND_BUTTON_TEXT_ID = 1032;
    public static final int FEEDBACK_SEND_GENERIC_ERROR_ID = 1036;
    public static final int FEEDBACK_SEND_NETWORK_ERROR_ID = 1037;
    public static final int FEEDBACK_SUBJECT_INPUT_HINT_ID = 1028;
    public static final int FEEDBACK_TITLE_ID = 1035;
    public static final int FEEDBACK_VALIDATE_EMAIL_EMPTY_ID = 1042;
    public static final int FEEDBACK_VALIDATE_EMAIL_ERROR_ID = 1039;
    public static final int FEEDBACK_VALIDATE_NAME_ERROR_ID = 1041;
    public static final int FEEDBACK_VALIDATE_SUBJECT_ERROR_ID = 1038;
    public static final int FEEDBACK_VALIDATE_TEXT_ERROR_ID = 1043;
    public static final int LOGIN_EMAIL_INPUT_HINT_ID = 1282;
    public static final int LOGIN_HEADLINE_TEXT_ID = 1280;
    public static final int LOGIN_LOGIN_BUTTON_TEXT_ID = 1284;
    public static final int LOGIN_MISSING_CREDENTIALS_TOAST_ID = 1281;
    public static final int LOGIN_PASSWORD_INPUT_HINT_ID = 1283;
    public static final int PAINT_DIALOG_MESSAGE_ID = 1540;
    public static final int PAINT_DIALOG_NEGATIVE_BUTTON_ID = 1541;
    public static final int PAINT_DIALOG_POSITIVE_BUTTON_ID = 1542;
    public static final int PAINT_INDICATOR_TOAST_ID = 1536;
    public static final int PAINT_MENU_CLEAR_ID = 1539;
    public static final int PAINT_MENU_SAVE_ID = 1537;
    public static final int PAINT_MENU_UNDO_ID = 1538;
    public static final int UPDATE_DIALOG_MESSAGE_ID = 514;
    public static final int UPDATE_DIALOG_NEGATIVE_BUTTON_ID = 515;
    public static final int UPDATE_DIALOG_POSITIVE_BUTTON_ID = 516;
    public static final int UPDATE_DIALOG_TITLE_ID = 513;
    public static final int UPDATE_MANDATORY_TOAST_ID = 512;

    public Strings()
    {
    }

    public static String get(int i)
    {
        return get(null, i);
    }

    public static String get(StringListener stringlistener, int i)
    {
        String s = null;
        if (stringlistener != null)
        {
            s = stringlistener.getStringForResource(i);
        }
        stringlistener = s;
        if (s == null)
        {
            stringlistener = (String)DEFAULT.get(Integer.valueOf(i));
        }
        return stringlistener;
    }

    public static void set(int i, String s)
    {
        if (s != null)
        {
            DEFAULT.put(Integer.valueOf(i), s);
        }
    }

    static 
    {
        DEFAULT = new HashMap();
        DEFAULT.put(Integer.valueOf(0), "Crash Data");
        DEFAULT.put(Integer.valueOf(1), "The app found information about previous crashes. Would you like to send this data to the developer?");
        DEFAULT.put(Integer.valueOf(2), "Dismiss");
        DEFAULT.put(Integer.valueOf(3), "Always send");
        DEFAULT.put(Integer.valueOf(4), "Send");
        DEFAULT.put(Integer.valueOf(256), "Download Failed");
        DEFAULT.put(Integer.valueOf(257), "The update could not be downloaded. Would you like to try again?");
        DEFAULT.put(Integer.valueOf(258), "Cancel");
        DEFAULT.put(Integer.valueOf(259), "Retry");
        DEFAULT.put(Integer.valueOf(512), "Please install the latest version to continue to use this app.");
        DEFAULT.put(Integer.valueOf(513), "Update Available");
        DEFAULT.put(Integer.valueOf(514), "Show information about the new update?");
        DEFAULT.put(Integer.valueOf(515), "Dismiss");
        DEFAULT.put(Integer.valueOf(516), "Show");
        DEFAULT.put(Integer.valueOf(768), "Build Expired");
        DEFAULT.put(Integer.valueOf(769), "This has build has expired. Please check HockeyApp for any updates.");
        DEFAULT.put(Integer.valueOf(1024), "Feedback Failed");
        DEFAULT.put(Integer.valueOf(1025), "Would you like to send your feedback again?");
        DEFAULT.put(Integer.valueOf(1026), "Name");
        DEFAULT.put(Integer.valueOf(1027), "Email");
        DEFAULT.put(Integer.valueOf(1028), "Subject");
        DEFAULT.put(Integer.valueOf(1029), "Message");
        DEFAULT.put(Integer.valueOf(1030), "Last Updated: ");
        DEFAULT.put(Integer.valueOf(1031), "Add Attachment");
        DEFAULT.put(Integer.valueOf(1032), "Send Feedback");
        DEFAULT.put(Integer.valueOf(1033), "Add a Response");
        DEFAULT.put(Integer.valueOf(1034), "Refresh");
        DEFAULT.put(Integer.valueOf(1035), "Feedback");
        DEFAULT.put(Integer.valueOf(1036), "Message couldn't be posted. Please check your input values and your connection, then try again.");
        DEFAULT.put(Integer.valueOf(1037), "No response from server. Please check your connection, then try again.");
        DEFAULT.put(Integer.valueOf(1038), "Please enter a subject");
        DEFAULT.put(Integer.valueOf(1041), "Please enter a name");
        DEFAULT.put(Integer.valueOf(1042), "Please enter an email address");
        DEFAULT.put(Integer.valueOf(1043), "Please enter a feedback text");
        DEFAULT.put(Integer.valueOf(1039), "Message couldn't be posted. Please check the format of your email address.");
        DEFAULT.put(Integer.valueOf(1040), "An error has occured");
        DEFAULT.put(Integer.valueOf(1280), "Please enter your account credentials.");
        DEFAULT.put(Integer.valueOf(1281), "Please fill in the missing account credentials.");
        DEFAULT.put(Integer.valueOf(1282), "Email");
        DEFAULT.put(Integer.valueOf(1283), "Password");
        DEFAULT.put(Integer.valueOf(1284), "Login");
        DEFAULT.put(Integer.valueOf(1536), "Draw something!");
        DEFAULT.put(Integer.valueOf(1537), "Save");
        DEFAULT.put(Integer.valueOf(1538), "Undo");
        DEFAULT.put(Integer.valueOf(1539), "Clear");
        DEFAULT.put(Integer.valueOf(1540), "Discard your drawings?");
        DEFAULT.put(Integer.valueOf(1541), "No");
        DEFAULT.put(Integer.valueOf(1542), "Yes");
    }
}
