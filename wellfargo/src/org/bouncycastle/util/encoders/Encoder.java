// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.encoders;

import java.io.OutputStream;

public interface Encoder
{

    public abstract int decode(String s, OutputStream outputstream);

    public abstract int decode(byte abyte0[], int i, int j, OutputStream outputstream);

    public abstract int encode(byte abyte0[], int i, int j, OutputStream outputstream);
}
