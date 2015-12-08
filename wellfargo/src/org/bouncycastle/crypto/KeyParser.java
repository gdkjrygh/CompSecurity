// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;

import java.io.InputStream;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public interface KeyParser
{

    public abstract AsymmetricKeyParameter readKey(InputStream inputstream);
}
