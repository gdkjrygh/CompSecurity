// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.GetProfileThemeOptionsResponse;
import com.ubercab.client.core.model.GetProfilesResponse;
import com.ubercab.client.core.model.ProfilesRequest;
import com.ubercab.client.core.model.UpdateProfileRequest;
import com.ubercab.client.core.model.UpdateProfileResponse;
import com.ubercab.client.core.network.TroyProfileApi;
import com.ubercab.rider.realtime.model.Profile;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dkm
    implements dkl
{

    private final cev a;
    private final TroyProfileApi b;

    public dkm(cev cev, TroyProfileApi troyprofileapi)
    {
        a = cev;
        b = troyprofileapi;
    }

    static cev a(dkm dkm1)
    {
        return dkm1.a;
    }

    public final void a(Profile profile, String s)
    {
        Callback callback = new Callback() {

            final dkm a;

            private void a(UpdateProfileResponse updateprofileresponse, Response response)
            {
                dkm.a(a).c(new dns(updateprofileresponse.getProfile(), response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkm.a(a).c(new dns(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((UpdateProfileResponse)obj, response);
            }

            
            {
                a = dkm.this;
                super();
            }
        };
        b.updateProfile(UpdateProfileRequest.create(s, profile), callback);
    }

    public final void a(String s)
    {
        Callback callback = new Callback() {

            final dkm a;

            private void a(GetProfilesResponse getprofilesresponse, Response response)
            {
                cev cev1 = dkm.a(a);
                if (getprofilesresponse == null)
                {
                    getprofilesresponse = null;
                } else
                {
                    getprofilesresponse = getprofilesresponse.getProfiles();
                }
                cev1.c(new dly(getprofilesresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkm.a(a).c(new dly(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((GetProfilesResponse)obj, response);
            }

            
            {
                a = dkm.this;
                super();
            }
        };
        b.getProfiles(ProfilesRequest.create(s), callback);
    }

    public final void b(String s)
    {
        Callback callback = new Callback() {

            final dkm a;

            private void a(GetProfileThemeOptionsResponse getprofilethemeoptionsresponse, Response response)
            {
                cev cev1 = dkm.a(a);
                if (getprofilethemeoptionsresponse == null)
                {
                    getprofilethemeoptionsresponse = null;
                } else
                {
                    getprofilethemeoptionsresponse = getprofilethemeoptionsresponse.getProfileThemeOptions();
                }
                cev1.c(new dlx(getprofilethemeoptionsresponse, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                dkm.a(a).c(new dlx(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((GetProfileThemeOptionsResponse)obj, response);
            }

            
            {
                a = dkm.this;
                super();
            }
        };
        b.getProfilesThemeOptions(ProfilesRequest.create(s), callback);
    }
}
