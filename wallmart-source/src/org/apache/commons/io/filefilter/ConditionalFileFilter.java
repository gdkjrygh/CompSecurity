// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.util.List;

// Referenced classes of package org.apache.commons.io.filefilter:
//            IOFileFilter

public interface ConditionalFileFilter
{

    public abstract void addFileFilter(IOFileFilter iofilefilter);

    public abstract List getFileFilters();

    public abstract boolean removeFileFilter(IOFileFilter iofilefilter);

    public abstract void setFileFilters(List list);
}
