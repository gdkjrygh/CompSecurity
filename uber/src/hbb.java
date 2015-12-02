// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class hbb
{

    public static Bundle a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        try
        {
            s = a(new JSONObject(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private static Bundle a(JSONObject jsonobject)
    {
        Bundle bundle = new Bundle();
        Iterator iterator = jsonobject.keys();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            try
            {
                if (!TextUtils.isEmpty(s) && !jsonobject.isNull(s))
                {
                    bundle.putString(s, jsonobject.get(s).toString());
                }
            }
            catch (JSONException jsonexception) { }
        } while (true);
        return bundle;
    }
}
