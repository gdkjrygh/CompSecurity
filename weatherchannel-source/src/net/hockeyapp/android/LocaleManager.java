// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

// Referenced classes of package net.hockeyapp.android:
//            Strings

public class LocaleManager
{

    public LocaleManager()
    {
    }

    public static void initialize(Context context)
    {
        loadFromResources("hockeyapp_crash_dialog_title", 0, context);
        loadFromResources("hockeyapp_crash_dialog_message", 1, context);
        loadFromResources("hockeyapp_crash_dialog_negative_button", 2, context);
        loadFromResources("hockeyapp_crash_dialog_positive_button", 4, context);
        loadFromResources("hockeyapp_download_failed_dialog_title", 256, context);
        loadFromResources("hockeyapp_download_failed_dialog_message", 257, context);
        loadFromResources("hockeyapp_download_failed_dialog_negative_button", 258, context);
        loadFromResources("hockeyapp_download_failed_dialog_positive_button", 259, context);
        loadFromResources("hockeyapp_update_mandatory_toast", 512, context);
        loadFromResources("hockeyapp_update_dialog_title", 513, context);
        loadFromResources("hockeyapp_update_dialog_message", 514, context);
        loadFromResources("hockeyapp_update_dialog_negative_button", 515, context);
        loadFromResources("hockeyapp_update_dialog_positive_button", 516, context);
        loadFromResources("hockeyapp_expiry_info_title", 768, context);
        loadFromResources("hockeyapp_expiry_info_text", 769, context);
        loadFromResources("hockeyapp_feedback_failed_title", 1024, context);
        loadFromResources("hockeyapp_feedback_failed_text", 1025, context);
        loadFromResources("hockeyapp_feedback_name_hint", 1026, context);
        loadFromResources("hockeyapp_feedback_email_hint", 1027, context);
        loadFromResources("hockeyapp_feedback_subject_hint", 1028, context);
        loadFromResources("hockeyapp_feedback_message_hint", 1029, context);
        loadFromResources("hockeyapp_feedback_last_updated_text", 1030, context);
        loadFromResources("hockeyapp_feedback_attachment_button_text", 1031, context);
        loadFromResources("hockeyapp_feedback_send_button_text", 1032, context);
        loadFromResources("hockeyapp_feedback_response_button_text", 1033, context);
        loadFromResources("hockeyapp_feedback_refresh_button_text", 1034, context);
        loadFromResources("hockeyapp_feedback_title", 1035, context);
        loadFromResources("hockeyapp_feedback_send_generic_error", 1036, context);
        loadFromResources("hockeyapp_feedback_send_network_error", 1037, context);
        loadFromResources("hockeyapp_feedback_validate_subject_error", 1038, context);
        loadFromResources("hockeyapp_feedback_validate_email_error", 1039, context);
        loadFromResources("hockeyapp_feedback_validate_email_empty", 1042, context);
        loadFromResources("hockeyapp_feedback_validate_name_error", 1041, context);
        loadFromResources("hockeyapp_feedback_validate_text_error", 1043, context);
        loadFromResources("hockeyapp_feedback_generic_error", 1040, context);
        loadFromResources("hockeyapp_login_headline_text", 1280, context);
        loadFromResources("hockeyapp_login_missing_credentials_toast", 1281, context);
        loadFromResources("hockeyapp_login_email_hint", 1282, context);
        loadFromResources("hockeyapp_login_password_hint", 1283, context);
        loadFromResources("hockeyapp_login_login_button_text", 1284, context);
        loadFromResources("hockeyapp_paint_indicator_toast", 1536, context);
        loadFromResources("hockeyapp_paint_menu_save", 1537, context);
        loadFromResources("hockeyapp_paint_menu_undo", 1538, context);
        loadFromResources("hockeyapp_paint_menu_clear", 1539, context);
        loadFromResources("hockeyapp_paint_dialog_message", 1540, context);
        loadFromResources("hockeyapp_paint_dialog_negative_button", 1541, context);
        loadFromResources("hockeyapp_paint_dialog_positive_button", 1542, context);
    }

    private static void loadFromResources(String s, int i, Context context)
    {
        int j = context.getResources().getIdentifier(s, "string", context.getPackageName());
        if (j != 0)
        {
            if (!TextUtils.isEmpty(s = context.getString(j)))
            {
                Strings.set(i, s);
                return;
            }
        }
    }
}
