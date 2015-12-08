// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.typeahead;

import com.walmart.android.service.JacksonConverter;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.service.typeahead:
//            SearchSuggestions

public class TypeAheadService
{

    private Service mService;

    public TypeAheadService(String s, ObjectMapper objectmapper, Log log)
    {
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).host(s).path("typeahead").converter(new JacksonConverter(objectmapper)).log(log).okHttpClient(SharedHttpClient.get()).build();
    }

    public Request getSearchSuggestions(String s)
    {
        return mService.newRequest().query("term", s).get(com/walmart/android/service/typeahead/SearchSuggestions);
    }
}
