// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.ubercab.rider.realtime.model.MobileMessage;

public final class efu
    implements efj
{

    public efu()
    {
    }

    public final eew a(Context context, MobileMessage mobilemessage, String s)
    {
        s = Uri.parse(s).getQueryParameter("text");
        if (TextUtils.isEmpty(s))
        {
            return eew.b;
        } else
        {
            ((ClipboardManager)context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(context.getString(0x7f0703ef), s));
            Toast.makeText(context, context.getString(0x7f0703f0), 0).show();
            return (new eex()).a(n.bg).b("clipboard").a(mobilemessage.getId()).b();
        }
    }
}
