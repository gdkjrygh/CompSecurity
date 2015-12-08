.class public final Lcom/google/android/gms/appinvite/AppInviteInvitation;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInvitationIds(ILandroid/content/Intent;)[Ljava/lang/String;
    .locals 1
    .param p0, "resultCode"    # I
    .param p1, "result"    # Landroid/content/Intent;

    .prologue
    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    const-string v0, "com.google.android.gms.appinvite.RESULT_INVITATION_IDS"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
