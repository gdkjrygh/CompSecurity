// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.ArrayList;

// Referenced classes of package com.facebook:
//            AuthorizationClient, Session, Response

class val.declinedPermissions
    implements val.declinedPermissions
{

    final AuthorizationClient this$0;
    final ArrayList val$declinedPermissions;
    final ArrayList val$grantedPermissions;

    public void onCompleted(Response response)
    {
        try
        {
            response = Session.handlePermissionResponse(response);
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            return;
        }
        if (response == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        val$grantedPermissions.addAll(response.getGrantedPermissions());
        val$declinedPermissions.addAll(response.getDeclinedPermissions());
    }

    r()
    {
        this$0 = final_authorizationclient;
        val$grantedPermissions = arraylist;
        val$declinedPermissions = ArrayList.this;
        super();
    }
}
