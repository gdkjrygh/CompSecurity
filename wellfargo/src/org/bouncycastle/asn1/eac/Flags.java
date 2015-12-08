// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;

import java.util.Enumeration;
import java.util.Hashtable;

public class Flags
{

    int value;

    public Flags()
    {
        value = 0;
    }

    public Flags(int i)
    {
        value = 0;
        value = i;
    }

    String decode(Hashtable hashtable)
    {
        StringJoiner stringjoiner = new StringJoiner(" ");
        Enumeration enumeration = hashtable.keys();
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            Integer integer = (Integer)enumeration.nextElement();
            if (isSet(integer.intValue()))
            {
                stringjoiner.add((String)hashtable.get(integer));
            }
        } while (true);
        return stringjoiner.toString();
    }

    public int getFlags()
    {
        return value;
    }

    public boolean isSet(int i)
    {
        return (value & i) != 0;
    }

    public void set(int i)
    {
        value = value | i;
    }

    private class StringJoiner
    {

        boolean First;
        StringBuffer b;
        String mSeparator;
        final Flags this$0;

        public void add(String s)
        {
            if (First)
            {
                First = false;
            } else
            {
                b.append(mSeparator);
            }
            b.append(s);
        }

        public String toString()
        {
            return b.toString();
        }

        public StringJoiner(String s)
        {
            this$0 = Flags.this;
            super();
            First = true;
            b = new StringBuffer();
            mSeparator = s;
        }
    }

}
