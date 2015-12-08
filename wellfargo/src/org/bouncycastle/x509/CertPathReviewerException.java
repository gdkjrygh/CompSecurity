// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.security.cert.CertPath;
import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocalizedException;

public class CertPathReviewerException extends LocalizedException
{

    private CertPath certPath;
    private int index;

    public CertPathReviewerException(ErrorBundle errorbundle)
    {
        super(errorbundle);
        index = -1;
        certPath = null;
    }

    public CertPathReviewerException(ErrorBundle errorbundle, Throwable throwable)
    {
        super(errorbundle, throwable);
        index = -1;
        certPath = null;
    }

    public CertPathReviewerException(ErrorBundle errorbundle, Throwable throwable, CertPath certpath, int i)
    {
        super(errorbundle, throwable);
        index = -1;
        certPath = null;
        if (certpath == null || i == -1)
        {
            throw new IllegalArgumentException();
        }
        if (i < -1 || certpath != null && i >= certpath.getCertificates().size())
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            certPath = certpath;
            index = i;
            return;
        }
    }

    public CertPathReviewerException(ErrorBundle errorbundle, CertPath certpath, int i)
    {
        super(errorbundle);
        index = -1;
        certPath = null;
        if (certpath == null || i == -1)
        {
            throw new IllegalArgumentException();
        }
        if (i < -1 || certpath != null && i >= certpath.getCertificates().size())
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            certPath = certpath;
            index = i;
            return;
        }
    }

    public CertPath getCertPath()
    {
        return certPath;
    }

    public int getIndex()
    {
        return index;
    }
}
