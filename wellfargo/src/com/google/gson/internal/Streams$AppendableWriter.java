// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.io.Writer;

final class <init> extends Writer
{

    private final Appendable appendable;
    private final CurrentWrite currentWrite;

    public void close()
    {
    }

    public void flush()
    {
    }

    public void write(int i)
    {
        appendable.append((char)i);
    }

    public void write(char ac[], int i, int j)
    {
        currentWrite.chars = ac;
        appendable.append(currentWrite, i, i + j);
    }

    private CurrentWrite(Appendable appendable1)
    {
        class CurrentWrite
            implements CharSequence
        {

            char chars[];

            public char charAt(int i)
            {
                return chars[i];
            }

            public int length()
            {
                return chars.length;
            }

            public CharSequence subSequence(int i, int j)
            {
                return new String(chars, i, j - i);
            }

            CurrentWrite()
            {
            }
        }

        currentWrite = new CurrentWrite();
        appendable = appendable1;
    }

    appendable(Appendable appendable1, appendable appendable2)
    {
        this(appendable1);
    }
}
