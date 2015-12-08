// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import org.json.JSONArray;
import org.json.JSONException;

class val.tcs
{

    final rySetError this$1;
    final rySetError val$tcs;

    public void setValue(String s)
    {
        try
        {
            val$tcs.rySetResult(new JSONArray(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            val$tcs.rySetError(s);
        }
    }

    ()
    {
        this$1 = final_;
        val$tcs = val.tcs.this;
        super();
    }
}
