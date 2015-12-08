.class public abstract Lcom/google/android/gms/internal/zzkd$zza;
.super Landroid/os/Binder;

# interfaces
.implements Lcom/google/android/gms/internal/zzkd;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzkd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzkd$zza$zza;
    }
.end annotation


# direct methods
.method public static zzaA(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzkd;
    .locals 2

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/google/android/gms/internal/zzkd;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/zzkd;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/zzkd$zza$zza;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzkd$zza$zza;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 5
    .param p1, "code"    # I
    .param p2, "data"    # Landroid/os/Parcel;
    .param p3, "reply"    # Landroid/os/Parcel;
    .param p4, "flags"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    sparse-switch p1, :sswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    :goto_0
    return v0

    :sswitch_0
    const-string v1, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService"

    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_1
    const-string v1, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzkd$zza;->destroy()V

    goto :goto_0

    :sswitch_2
    const-string v1, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzkd$zza;->disconnect()V

    goto :goto_0

    :sswitch_3
    const-string v1, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzkc$zza;->zzaz(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzkc;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/zzke$zza;->zzaB(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzke;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzkd$zza;->zza(Lcom/google/android/gms/internal/zzkc;Lcom/google/android/gms/internal/zzke;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :sswitch_4
    const-string v1, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzkc$zza;->zzaz(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzkc;

    move-result-object v1

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/zzkd$zza;->zza(Lcom/google/android/gms/internal/zzkc;I)V

    goto :goto_0

    :sswitch_5
    const-string v1, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService"

    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/zzkc$zza;->zzaz(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzkc;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/zzkd$zza;->zza(Lcom/google/android/gms/internal/zzkc;)V

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0x6 -> :sswitch_5
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
