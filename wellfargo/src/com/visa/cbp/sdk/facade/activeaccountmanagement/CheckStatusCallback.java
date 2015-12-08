// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.activeaccountmanagement;

import com.visa.cbp.external.aam.CheckStatusResponse;
import com.visa.cbp.sdk.facade.data.GenericResponse;
import com.visa.cbp.sdk.facade.error.CbpError;
import java.util.List;

public interface CheckStatusCallback
{

    public abstract void failure(CbpError cbperror);

    public abstract void success(CheckStatusResponse checkstatusresponse, List list, GenericResponse genericresponse);
}
