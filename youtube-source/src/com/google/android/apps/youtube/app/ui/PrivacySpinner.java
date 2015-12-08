// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Spinner;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.p;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ds

public class PrivacySpinner extends Spinner
{

    private static final Map a;
    private final LayoutInflater b;

    public PrivacySpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = LayoutInflater.from(context);
        setAdapter(new ds(this));
    }

    static LayoutInflater a(PrivacySpinner privacyspinner)
    {
        return privacyspinner.b;
    }

    static Map b()
    {
        return a;
    }

    public final com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy a()
    {
        return (com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy)getSelectedItem();
    }

    public void setPrivacy(com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy)
    {
        c.a(privacy);
        setSelection(privacy.ordinal());
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put(com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PRIVATE, Integer.valueOf(p.gU));
        a.put(com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PUBLIC, Integer.valueOf(p.gW));
        a.put(com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.UNLISTED, Integer.valueOf(p.gY));
    }
}
