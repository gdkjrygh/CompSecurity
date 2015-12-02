// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.Collections;
import java.util.List;

public final class InvitationsResponse
{

    private Integer count;
    private List invites;

    public InvitationsResponse()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (InvitationsResponse)obj;
            if (count == null ? ((InvitationsResponse) (obj)).count != null : !count.equals(((InvitationsResponse) (obj)).count))
            {
                return false;
            }
            if (invites == null ? ((InvitationsResponse) (obj)).invites != null : !invites.equals(((InvitationsResponse) (obj)).invites))
            {
                return false;
            }
        }
        return true;
    }

    public final int getCount()
    {
        if (count == null)
        {
            return 0;
        } else
        {
            return count.intValue();
        }
    }

    public final List getInvites()
    {
        if (invites == null)
        {
            return Collections.emptyList();
        } else
        {
            return invites;
        }
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (count != null)
        {
            i = count.hashCode();
        } else
        {
            i = 0;
        }
        if (invites != null)
        {
            j = invites.hashCode();
        }
        return i * 31 + j;
    }

    final void setCount(Integer integer)
    {
        count = integer;
    }

    final void setInvites(List list)
    {
        invites = list;
    }
}
