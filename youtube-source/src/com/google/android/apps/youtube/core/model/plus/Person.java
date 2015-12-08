// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.model.plus;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.Serializable;

public final class Person
    implements Serializable
{

    public final String displayName;
    private volatile int hashCode;
    public final String id;
    public final Uri imageUri;
    public final Uri profileUri;

    public Person(String s, String s1, Uri uri, Uri uri1)
    {
        id = (String)c.a(s);
        displayName = (String)c.a(s1);
        profileUri = (Uri)c.a(uri);
        imageUri = (Uri)c.a(uri1);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Person))
            {
                return false;
            }
            obj = (Person)obj;
            if (!id.equals(((Person) (obj)).id) || !displayName.equals(((Person) (obj)).displayName) || !profileUri.equals(((Person) (obj)).profileUri) || !imageUri.equals(((Person) (obj)).imageUri))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            i = (((id.hashCode() + 527) * 31 + displayName.hashCode()) * 31 + profileUri.hashCode()) * 31 + imageUri.hashCode();
            hashCode = i;
        }
        return i;
    }

    public final String toString()
    {
        return (new StringBuilder("Person{")).append(Integer.toHexString(System.identityHashCode(this))).append(" id=").append(id).append(" displayName=").append(displayName).append("}").toString();
    }
}
