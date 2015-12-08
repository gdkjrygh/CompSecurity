.class public abstract Lcom/google/android/gms/gcm/Task;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/gcm/Task$Builder;
    }
.end annotation


# static fields
.field public static final NETWORK_STATE_ANY:I = 0x2

.field public static final NETWORK_STATE_CONNECTED:I = 0x0

.field public static final NETWORK_STATE_UNMETERED:I = 0x1

.field protected static final UNINITIALIZED:J = -0x1L


# instance fields
.field private final mTag:Ljava/lang/String;

.field private final zzawf:Ljava/lang/String;

.field private final zzawg:Z

.field private final zzawh:Z

.field private final zzawi:I

.field private final zzawj:Z


# direct methods
.method constructor <init>(Landroid/os/Parcel;)V
    .locals 3
    .param p1, "in"    # Landroid/os/Parcel;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/gcm/Task;->zzawf:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/gcm/Task;->mTag:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/google/android/gms/gcm/Task;->zzawg:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_1

    :goto_1
    iput-boolean v1, p0, Lcom/google/android/gms/gcm/Task;->zzawh:Z

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/gcm/Task;->zzawi:I

    iput-boolean v2, p0, Lcom/google/android/gms/gcm/Task;->zzawj:Z

    return-void

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method constructor <init>(Lcom/google/android/gms/gcm/Task$Builder;)V
    .locals 1
    .param p1, "builder"    # Lcom/google/android/gms/gcm/Task$Builder;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/gcm/Task$Builder;->gcmTaskService:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/gcm/Task;->zzawf:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/gcm/Task$Builder;->tag:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/gcm/Task;->mTag:Ljava/lang/String;

    iget-boolean v0, p1, Lcom/google/android/gms/gcm/Task$Builder;->updateCurrent:Z

    iput-boolean v0, p0, Lcom/google/android/gms/gcm/Task;->zzawg:Z

    iget-boolean v0, p1, Lcom/google/android/gms/gcm/Task$Builder;->isPersisted:Z

    iput-boolean v0, p0, Lcom/google/android/gms/gcm/Task;->zzawh:Z

    iget v0, p1, Lcom/google/android/gms/gcm/Task$Builder;->requiredNetworkState:I

    iput v0, p0, Lcom/google/android/gms/gcm/Task;->zzawi:I

    iget-boolean v0, p1, Lcom/google/android/gms/gcm/Task$Builder;->requiresCharging:Z

    iput-boolean v0, p0, Lcom/google/android/gms/gcm/Task;->zzawj:Z

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getRequiredNetwork()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/gcm/Task;->zzawi:I

    return v0
.end method

.method public getRequiresCharging()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/gcm/Task;->zzawj:Z

    return v0
.end method

.method public getServiceName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/gcm/Task;->zzawf:Ljava/lang/String;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/gcm/Task;->mTag:Ljava/lang/String;

    return-object v0
.end method

.method public isPersisted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/gcm/Task;->zzawh:Z

    return v0
.end method

.method public isUpdateCurrent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/gcm/Task;->zzawg:Z

    return v0
.end method

.method public toBundle(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    const-string v0, "tag"

    iget-object v1, p0, Lcom/google/android/gms/gcm/Task;->mTag:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "update_current"

    iget-boolean v1, p0, Lcom/google/android/gms/gcm/Task;->zzawg:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "persisted"

    iget-boolean v1, p0, Lcom/google/android/gms/gcm/Task;->zzawh:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "service"

    iget-object v1, p0, Lcom/google/android/gms/gcm/Task;->zzawf:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "requiredNetwork"

    iget v1, p0, Lcom/google/android/gms/gcm/Task;->zzawi:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "requiresCharging"

    iget-boolean v1, p0, Lcom/google/android/gms/gcm/Task;->zzawj:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3
    .param p1, "parcel"    # Landroid/os/Parcel;
    .param p2, "i"    # I

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/gcm/Task;->zzawf:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/gcm/Task;->mTag:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/google/android/gms/gcm/Task;->zzawg:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/google/android/gms/gcm/Task;->zzawh:Z

    if-eqz v0, :cond_1

    :goto_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method
