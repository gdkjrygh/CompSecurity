// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.Map;

public final class eff
{

    private Map a;

    public eff(cev cev)
    {
        a = (new gkh()).a("cancel_button_tap", new efo()).a("confirm_action", new efp(cev)).a("open_url_in_safari", new efq()).a("open_url_in_internal_browser", new efq()).a("share_email", new efv()).a("share_facebook", new efw()).a("share_message", new efy()).a("share_clipboard", new efu()).a("share_twitter", new efz()).a("show_add_payment_modal", new efr()).a("show_profile", new efs()).a("share_weibo", new egd()).a("share_wechat", new egc()).a("share_moments", new egb()).a();
    }

    public final efj a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        }
        if (s.startsWith("native://"))
        {
            s = Uri.parse(s);
            efj efj1 = (efj)a.get(s.getAuthority());
            if (efj1 != null)
            {
                return efj1;
            }
            if (s.getAuthority().startsWith("share_"))
            {
                return new efx();
            } else
            {
                return new ege();
            }
        }
        if (s.startsWith("http"))
        {
            return new eft();
        } else
        {
            return new ege();
        }
    }
}
