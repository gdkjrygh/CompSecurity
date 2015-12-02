// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.text.TextUtils;
import com.ubercab.rider.realtime.model.Itinerary;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import gjy;
import gka;
import gki;
import gpq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.ubercab.client.core.model:
//            TripExpenseInfo, Itinerary, ReverseGeocode, TripPendingRating, 
//            PaymentProfile

public class Client
    implements com.ubercab.rider.realtime.model.Client
{

    public static final String STATUS_DISPATCHING = "Dispatching";
    public static final String STATUS_LOOKING = "Looking";
    public static final String STATUS_ON_TRIP = "OnTrip";
    public static final String STATUS_WAITING_FOR_PICKUP = "WaitingForPickup";
    String claimedMobile;
    int countryId;
    List creditBalances;
    String email;
    String fareSplitFeeString;
    String firstName;
    boolean hasAmericanMobile;
    boolean hasConfirmedMobile;
    boolean hasToOptInSmsNotifications;
    List inactivePaymentProfiles;
    boolean isAdmin;
    com.ubercab.client.core.model.Itinerary lastEstimatedTrip;
    com.ubercab.client.core.model.TripExpenseInfo lastExpenseInfo;
    String lastName;
    String lastRequestMsg;
    String lastRequestNote;
    String lastSelectedPaymentProfileId;
    boolean lastSelectedPaymentProfileIsGoogleWallet;
    String lastSelectedPaymentProfileUUID;
    String mobile;
    String mobileCountryCode;
    int mobileCountryId;
    String mobileCountryIso2;
    String mobileDigits;
    List paymentProfiles;
    String pictureUrl;
    List profiles;
    String promotion;
    List recentFareSplitters;
    String referralCode;
    String referralUrl;
    ReverseGeocode reverseGeocode;
    String role;
    String status;
    Map thirdPartyIdentities;
    String token;
    List tripBalances;
    TripPendingRating tripPendingRating;
    String uuid;

    public Client()
    {
        mobileCountryId = 0;
        isAdmin = false;
        hasAmericanMobile = false;
        hasConfirmedMobile = false;
        hasToOptInSmsNotifications = false;
        email = "";
        fareSplitFeeString = "";
        firstName = "";
        uuid = "";
        lastName = "";
        lastRequestMsg = "";
        lastRequestNote = "";
        mobileCountryCode = "";
        mobileCountryIso2 = "";
        mobileDigits = "";
        pictureUrl = "";
        promotion = "";
        referralCode = "";
        referralUrl = "";
        role = "";
        status = "";
        token = "";
        lastEstimatedTrip = null;
        lastExpenseInfo = new com.ubercab.client.core.model.TripExpenseInfo();
        reverseGeocode = null;
        tripPendingRating = null;
        creditBalances = new ArrayList();
        tripBalances = new ArrayList();
        paymentProfiles = new ArrayList();
        profiles = new ArrayList();
        recentFareSplitters = new ArrayList();
        thirdPartyIdentities = new HashMap();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Client)obj;
            if (countryId != ((Client) (obj)).countryId)
            {
                return false;
            }
            if (mobileCountryId != ((Client) (obj)).mobileCountryId)
            {
                return false;
            }
            if (isAdmin != ((Client) (obj)).isAdmin)
            {
                return false;
            }
            if (hasAmericanMobile != ((Client) (obj)).hasAmericanMobile)
            {
                return false;
            }
            if (hasConfirmedMobile != ((Client) (obj)).hasConfirmedMobile)
            {
                return false;
            }
            if (hasToOptInSmsNotifications != ((Client) (obj)).hasToOptInSmsNotifications)
            {
                return false;
            }
            if (lastSelectedPaymentProfileIsGoogleWallet != ((Client) (obj)).lastSelectedPaymentProfileIsGoogleWallet)
            {
                return false;
            }
            if (email == null ? ((Client) (obj)).email != null : !email.equals(((Client) (obj)).email))
            {
                return false;
            }
            if (fareSplitFeeString == null ? ((Client) (obj)).fareSplitFeeString != null : !fareSplitFeeString.equals(((Client) (obj)).fareSplitFeeString))
            {
                return false;
            }
            if (firstName == null ? ((Client) (obj)).firstName != null : !firstName.equals(((Client) (obj)).firstName))
            {
                return false;
            }
            if (uuid == null ? ((Client) (obj)).uuid != null : !uuid.equals(((Client) (obj)).uuid))
            {
                return false;
            }
            if (lastName == null ? ((Client) (obj)).lastName != null : !lastName.equals(((Client) (obj)).lastName))
            {
                return false;
            }
            if (lastRequestMsg == null ? ((Client) (obj)).lastRequestMsg != null : !lastRequestMsg.equals(((Client) (obj)).lastRequestMsg))
            {
                return false;
            }
            if (lastRequestNote == null ? ((Client) (obj)).lastRequestNote != null : !lastRequestNote.equals(((Client) (obj)).lastRequestNote))
            {
                return false;
            }
            if (lastSelectedPaymentProfileId == null ? ((Client) (obj)).lastSelectedPaymentProfileId != null : !lastSelectedPaymentProfileId.equals(((Client) (obj)).lastSelectedPaymentProfileId))
            {
                return false;
            }
            if (mobile == null ? ((Client) (obj)).mobile != null : !mobile.equals(((Client) (obj)).mobile))
            {
                return false;
            }
            if (claimedMobile == null ? ((Client) (obj)).claimedMobile != null : !claimedMobile.equals(((Client) (obj)).claimedMobile))
            {
                return false;
            }
            if (mobileCountryCode == null ? ((Client) (obj)).mobileCountryCode != null : !mobileCountryCode.equals(((Client) (obj)).mobileCountryCode))
            {
                return false;
            }
            if (mobileCountryIso2 == null ? ((Client) (obj)).mobileCountryIso2 != null : !mobileCountryIso2.equals(((Client) (obj)).mobileCountryIso2))
            {
                return false;
            }
            if (mobileDigits == null ? ((Client) (obj)).mobileDigits != null : !mobileDigits.equals(((Client) (obj)).mobileDigits))
            {
                return false;
            }
            if (pictureUrl == null ? ((Client) (obj)).pictureUrl != null : !pictureUrl.equals(((Client) (obj)).pictureUrl))
            {
                return false;
            }
            if (promotion == null ? ((Client) (obj)).promotion != null : !promotion.equals(((Client) (obj)).promotion))
            {
                return false;
            }
            if (profiles == null ? ((Client) (obj)).profiles != null : !profiles.equals(((Client) (obj)).promotion))
            {
                return false;
            }
            if (referralCode == null ? ((Client) (obj)).referralCode != null : !referralCode.equals(((Client) (obj)).referralCode))
            {
                return false;
            }
            if (referralUrl == null ? ((Client) (obj)).referralUrl != null : !referralUrl.equals(((Client) (obj)).referralUrl))
            {
                return false;
            }
            if (role == null ? ((Client) (obj)).role != null : !role.equals(((Client) (obj)).role))
            {
                return false;
            }
            if (status == null ? ((Client) (obj)).status != null : !status.equals(((Client) (obj)).status))
            {
                return false;
            }
            if (token == null ? ((Client) (obj)).token != null : !token.equals(((Client) (obj)).token))
            {
                return false;
            }
            if (lastSelectedPaymentProfileUUID == null ? ((Client) (obj)).lastSelectedPaymentProfileUUID != null : !lastSelectedPaymentProfileUUID.equals(((Client) (obj)).lastSelectedPaymentProfileUUID))
            {
                return false;
            }
            if (lastEstimatedTrip == null ? ((Client) (obj)).lastEstimatedTrip != null : !lastEstimatedTrip.equals(((Client) (obj)).lastEstimatedTrip))
            {
                return false;
            }
            if (lastExpenseInfo == null ? ((Client) (obj)).lastExpenseInfo != null : !lastExpenseInfo.equals(((Client) (obj)).lastExpenseInfo))
            {
                return false;
            }
            if (reverseGeocode == null ? ((Client) (obj)).reverseGeocode != null : !reverseGeocode.equals(((Client) (obj)).reverseGeocode))
            {
                return false;
            }
            if (tripPendingRating == null ? ((Client) (obj)).tripPendingRating != null : !tripPendingRating.equals(((Client) (obj)).tripPendingRating))
            {
                return false;
            }
            if (creditBalances == null ? ((Client) (obj)).creditBalances != null : !creditBalances.equals(((Client) (obj)).creditBalances))
            {
                return false;
            }
            if (tripBalances == null ? ((Client) (obj)).tripBalances != null : !tripBalances.equals(((Client) (obj)).tripBalances))
            {
                return false;
            }
            if (paymentProfiles == null ? ((Client) (obj)).paymentProfiles != null : !paymentProfiles.equals(((Client) (obj)).paymentProfiles))
            {
                return false;
            }
            if (inactivePaymentProfiles == null ? ((Client) (obj)).inactivePaymentProfiles != null : !inactivePaymentProfiles.equals(((Client) (obj)).inactivePaymentProfiles))
            {
                return false;
            }
            if (recentFareSplitters == null ? ((Client) (obj)).recentFareSplitters != null : !recentFareSplitters.equals(((Client) (obj)).recentFareSplitters))
            {
                return false;
            }
            if (thirdPartyIdentities == null ? ((Client) (obj)).thirdPartyIdentities != null : !thirdPartyIdentities.equals(((Client) (obj)).thirdPartyIdentities))
            {
                return false;
            }
        }
        return true;
    }

    public PaymentProfile findPaymentProfileByUuid(final String uuid)
    {
        if (!TextUtils.isEmpty(uuid))
        {
            if (PaymentProfile.GOOGLE_WALLET.getUuid().equals(uuid))
            {
                return PaymentProfile.GOOGLE_WALLET;
            }
            List list = getPaymentProfiles();
            if (list != null)
            {
                return (PaymentProfile)gki.d(list, new gka() {

                    final Client this$0;
                    final String val$uuid;

                    public boolean apply(PaymentProfile paymentprofile)
                    {
                        return uuid.equals(paymentprofile.getUuid());
                    }

                    public volatile boolean apply(Object obj)
                    {
                        return apply((PaymentProfile)obj);
                    }

            
            {
                this$0 = Client.this;
                uuid = s;
                super();
            }
                }).d();
            }
        }
        return null;
    }

    public String getClaimedMobile()
    {
        return claimedMobile;
    }

    public int getCountryId()
    {
        return countryId;
    }

    public List getCreditBalances()
    {
        return creditBalances;
    }

    public String getCurrentMobile()
    {
        if (TextUtils.isEmpty(mobile))
        {
            return claimedMobile;
        } else
        {
            return mobile;
        }
    }

    public String getEmail()
    {
        return email;
    }

    public String getFareSplitFeeString()
    {
        return fareSplitFeeString;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getFormattedName()
    {
        return gpq.a(getFirstName(), getLastName(), Locale.getDefault());
    }

    public boolean getHasAmericanMobile()
    {
        return hasAmericanMobile;
    }

    public boolean getHasConfirmedMobile()
    {
        return hasConfirmedMobile;
    }

    public boolean getHasToOptInSmsNotifications()
    {
        return hasToOptInSmsNotifications;
    }

    public List getInactivePaymentProfiles()
    {
        if (inactivePaymentProfiles == null)
        {
            return null;
        } else
        {
            return new ArrayList(inactivePaymentProfiles);
        }
    }

    public boolean getIsAdmin()
    {
        return isAdmin;
    }

    public com.ubercab.client.core.model.Itinerary getLastEstimatedTrip()
    {
        return lastEstimatedTrip;
    }

    public volatile Itinerary getLastEstimatedTrip()
    {
        return getLastEstimatedTrip();
    }

    public TripExpenseInfo getLastExpenseInfo()
    {
        return lastExpenseInfo;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getLastRequestMsg()
    {
        return lastRequestMsg;
    }

    public String getLastRequestNote()
    {
        return lastRequestNote;
    }

    public PaymentProfile getLastSelectedPaymentProfile()
    {
        if (paymentProfiles.isEmpty())
        {
            return null;
        }
        for (Iterator iterator = paymentProfiles.iterator(); iterator.hasNext();)
        {
            PaymentProfile paymentprofile = (PaymentProfile)iterator.next();
            if (paymentprofile.getUuid().equals(lastSelectedPaymentProfileUUID))
            {
                return paymentprofile;
            }
        }

        return (PaymentProfile)paymentProfiles.get(0);
    }

    public boolean getLastSelectedPaymentProfileIsGoogleWallet()
    {
        return lastSelectedPaymentProfileUUID == null && lastSelectedPaymentProfileIsGoogleWallet;
    }

    public String getLastSelectedPaymentProfileUUID()
    {
        return lastSelectedPaymentProfileUUID;
    }

    public String getMobile()
    {
        return mobile;
    }

    public String getMobileCountryCode()
    {
        return mobileCountryCode;
    }

    public int getMobileCountryId()
    {
        return mobileCountryId;
    }

    public String getMobileCountryIso2()
    {
        return mobileCountryIso2;
    }

    public String getMobileDigits()
    {
        return mobileDigits;
    }

    public List getPaymentProfiles()
    {
        if (paymentProfiles == null)
        {
            return null;
        } else
        {
            return new ArrayList(paymentProfiles);
        }
    }

    public String getPictureUrl()
    {
        return pictureUrl;
    }

    public List getProfiles()
    {
        return profiles;
    }

    public String getPromotion()
    {
        return promotion;
    }

    public List getRecentFareSplitters()
    {
        return recentFareSplitters;
    }

    public String getReferralCode()
    {
        return referralCode;
    }

    public String getReferralUrl()
    {
        return referralUrl;
    }

    public ReverseGeocode getReverseGeocode()
    {
        return reverseGeocode;
    }

    public String getRole()
    {
        return role;
    }

    public String getStatus()
    {
        return status;
    }

    public Map getThirdPartyIdentities()
    {
        return thirdPartyIdentities;
    }

    public String getToken()
    {
        return token;
    }

    public List getTripBalances()
    {
        return tripBalances;
    }

    public TripPendingRating getTripPendingRating()
    {
        return tripPendingRating;
    }

    public String getUuid()
    {
        return uuid;
    }

    public int hashCode()
    {
        int i1 = 1;
        int i9 = 0;
        int j9 = countryId;
        int k9 = mobileCountryId;
        int i;
        int j;
        int k;
        int l;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l6;
        int i7;
        int j7;
        int k7;
        int l7;
        int i8;
        int j8;
        int k8;
        int l8;
        if (isAdmin)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (hasAmericanMobile)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (hasConfirmedMobile)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (hasToOptInSmsNotifications)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (!lastSelectedPaymentProfileIsGoogleWallet)
        {
            i1 = 0;
        }
        if (email != null)
        {
            j1 = email.hashCode();
        } else
        {
            j1 = 0;
        }
        if (fareSplitFeeString != null)
        {
            k1 = fareSplitFeeString.hashCode();
        } else
        {
            k1 = 0;
        }
        if (firstName != null)
        {
            l1 = firstName.hashCode();
        } else
        {
            l1 = 0;
        }
        if (uuid != null)
        {
            i2 = uuid.hashCode();
        } else
        {
            i2 = 0;
        }
        if (lastName != null)
        {
            j2 = lastName.hashCode();
        } else
        {
            j2 = 0;
        }
        if (lastRequestMsg != null)
        {
            k2 = lastRequestMsg.hashCode();
        } else
        {
            k2 = 0;
        }
        if (lastRequestNote != null)
        {
            l2 = lastRequestNote.hashCode();
        } else
        {
            l2 = 0;
        }
        if (lastSelectedPaymentProfileId != null)
        {
            i3 = lastSelectedPaymentProfileId.hashCode();
        } else
        {
            i3 = 0;
        }
        if (mobile != null)
        {
            j3 = mobile.hashCode();
        } else
        {
            j3 = 0;
        }
        if (claimedMobile != null)
        {
            k3 = claimedMobile.hashCode();
        } else
        {
            k3 = 0;
        }
        if (mobileCountryCode != null)
        {
            l3 = mobileCountryCode.hashCode();
        } else
        {
            l3 = 0;
        }
        if (mobileCountryIso2 != null)
        {
            i4 = mobileCountryIso2.hashCode();
        } else
        {
            i4 = 0;
        }
        if (mobileDigits != null)
        {
            j4 = mobileDigits.hashCode();
        } else
        {
            j4 = 0;
        }
        if (pictureUrl != null)
        {
            k4 = pictureUrl.hashCode();
        } else
        {
            k4 = 0;
        }
        if (promotion != null)
        {
            l4 = promotion.hashCode();
        } else
        {
            l4 = 0;
        }
        if (profiles != null)
        {
            i5 = profiles.hashCode();
        } else
        {
            i5 = 0;
        }
        if (referralCode != null)
        {
            j5 = referralCode.hashCode();
        } else
        {
            j5 = 0;
        }
        if (referralUrl != null)
        {
            k5 = referralUrl.hashCode();
        } else
        {
            k5 = 0;
        }
        if (role != null)
        {
            l5 = role.hashCode();
        } else
        {
            l5 = 0;
        }
        if (status != null)
        {
            i6 = status.hashCode();
        } else
        {
            i6 = 0;
        }
        if (token != null)
        {
            j6 = token.hashCode();
        } else
        {
            j6 = 0;
        }
        if (lastSelectedPaymentProfileUUID != null)
        {
            k6 = lastSelectedPaymentProfileUUID.hashCode();
        } else
        {
            k6 = 0;
        }
        if (lastEstimatedTrip != null)
        {
            l6 = lastEstimatedTrip.hashCode();
        } else
        {
            l6 = 0;
        }
        if (lastExpenseInfo != null)
        {
            i7 = lastExpenseInfo.hashCode();
        } else
        {
            i7 = 0;
        }
        if (reverseGeocode != null)
        {
            j7 = reverseGeocode.hashCode();
        } else
        {
            j7 = 0;
        }
        if (tripPendingRating != null)
        {
            k7 = tripPendingRating.hashCode();
        } else
        {
            k7 = 0;
        }
        if (creditBalances != null)
        {
            l7 = creditBalances.hashCode();
        } else
        {
            l7 = 0;
        }
        if (tripBalances != null)
        {
            i8 = tripBalances.hashCode();
        } else
        {
            i8 = 0;
        }
        if (paymentProfiles != null)
        {
            j8 = paymentProfiles.hashCode();
        } else
        {
            j8 = 0;
        }
        if (inactivePaymentProfiles != null)
        {
            k8 = inactivePaymentProfiles.hashCode();
        } else
        {
            k8 = 0;
        }
        if (recentFareSplitters != null)
        {
            l8 = recentFareSplitters.hashCode();
        } else
        {
            l8 = 0;
        }
        if (thirdPartyIdentities != null)
        {
            i9 = thirdPartyIdentities.hashCode();
        }
        return (l8 + (k8 + (j8 + (i8 + (l7 + (k7 + (j7 + (i7 + (l6 + (k6 + (j6 + (i6 + (l5 + (k5 + (j5 + (i5 + (l4 + (k4 + (j4 + (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + ((l + (k + (j + (i + (j9 * 31 + k9) * 31) * 31) * 31) * 31) * 31 + i1) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i9;
    }

    public Boolean isMobileRevoked()
    {
        boolean flag;
        if (!hasConfirmedMobile && TextUtils.isEmpty(getCurrentMobile()) && TextUtils.isEmpty(mobileDigits))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }
}
