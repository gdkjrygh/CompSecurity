// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.HashMap;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ai, a7, t

public class ab
    implements ai
{

    private t a;
    private Uri b;

    public ab(ContentResolver contentresolver, Uri uri)
    {
        b = uri;
        a = new a7(this, contentresolver, uri);
    }

    public t a(int i)
    {
        if (i == 0)
        {
            t t;
            try
            {
                t = a;
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                throw unsupportedoperationexception;
            }
            return t;
        } else
        {
            return null;
        }
    }

    public void a()
    {
    }

    public void a(ContentObserver contentobserver)
    {
    }

    public void b()
    {
        a = null;
        b = null;
    }

    public void b(ContentObserver contentobserver)
    {
    }

    public HashMap c()
    {
        throw new UnsupportedOperationException();
    }

    public int d()
    {
        return 1;
    }

    public boolean e()
    {
        return false;
    }
}
