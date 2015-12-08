.class public Lcom/google/android/gms/plus/internal/zze;
.super Lcom/google/android/gms/common/internal/zzi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/plus/internal/zze$zzf;,
        Lcom/google/android/gms/plus/internal/zze$zzc;,
        Lcom/google/android/gms/plus/internal/zze$zze;,
        Lcom/google/android/gms/plus/internal/zze$zzd;,
        Lcom/google/android/gms/plus/internal/zze$zzb;,
        Lcom/google/android/gms/plus/internal/zze$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/zzi",
        "<",
        "Lcom/google/android/gms/plus/internal/zzd;",
        ">;"
    }
.end annotation


# instance fields
.field private zzaHl:Lcom/google/android/gms/plus/model/people/Person;

.field private final zzaHm:Lcom/google/android/gms/plus/internal/PlusSession;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/zze;Lcom/google/android/gms/plus/internal/PlusSession;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    .locals 7

    const/4 v3, 0x2

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p5

    move-object v5, p6

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/zzi;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Lcom/google/android/gms/common/internal/zze;)V

    iput-object p4, p0, Lcom/google/android/gms/plus/internal/zze;->zzaHm:Lcom/google/android/gms/plus/internal/PlusSession;

    return-void
.end method

.method public static zze(Ljava/util/Set;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)Z"
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v2

    if-ne v2, v1, :cond_2

    new-instance v2, Lcom/google/android/gms/common/api/Scope;

    const-string v3, "plus_one_placeholder_scope"

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method private zzkS()Landroid/os/Bundle;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/zze;->zzaHm:Lcom/google/android/gms/plus/internal/PlusSession;

    invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/PlusSession;->zzxE()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "request_visible_actions"

    iget-object v2, p0, Lcom/google/android/gms/plus/internal/zze;->zzaHm:Lcom/google/android/gms/plus/internal/PlusSession;

    invoke-virtual {v2}, Lcom/google/android/gms/plus/internal/PlusSession;->zzxy()[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v1, "auth_package"

    iget-object v2, p0, Lcom/google/android/gms/plus/internal/zze;->zzaHm:Lcom/google/android/gms/plus/internal/PlusSession;

    invoke-virtual {v2}, Lcom/google/android/gms/plus/internal/PlusSession;->zzxA()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public getAccountName()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznL()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/plus/internal/zzd;

    invoke-interface {v0}, Lcom/google/android/gms/plus/internal/zzd;->getAccountName()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.plus.internal.IPlusService"

    return-object v0
.end method

.method protected getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.plus.service.START"

    return-object v0
.end method

.method public requiresSignIn()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznK()Lcom/google/android/gms/common/internal/zze;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/plus/Plus;->API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/zze;->zzb(Lcom/google/android/gms/common/api/Api;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/plus/internal/zze;->zze(Ljava/util/Set;)Z

    move-result v0

    return v0
.end method

.method protected synthetic zzT(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/plus/internal/zze;->zzdu(Landroid/os/IBinder;)Lcom/google/android/gms/plus/internal/zzd;

    move-result-object v0

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/common/api/zza$zzb;ILjava/lang/String;)Lcom/google/android/gms/common/internal/ICancelToken;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/plus/People$LoadPeopleResult;",
            ">;I",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/internal/ICancelToken;"
        }
    .end annotation

    const/4 v6, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznL()V

    new-instance v1, Lcom/google/android/gms/plus/internal/zze$zze;

    invoke-direct {v1, p1}, Lcom/google/android/gms/plus/internal/zze$zze;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/plus/internal/zzd;

    const/4 v2, 0x1

    const/4 v4, -0x1

    move v3, p2

    move-object v5, p3

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/plus/internal/zzd;->zza(Lcom/google/android/gms/plus/internal/zzb;IIILjava/lang/String;)Lcom/google/android/gms/common/internal/ICancelToken;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/16 v0, 0x8

    invoke-static {v0}, Lcom/google/android/gms/common/data/DataHolder;->zzbi(I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v0

    invoke-virtual {v1, v0, v6}, Lcom/google/android/gms/plus/internal/zze$zze;->zza(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;)V

    move-object v0, v6

    goto :goto_0
.end method

.method protected zza(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    .locals 1

    if-nez p1, :cond_0

    if-eqz p3, :cond_0

    const-string v0, "loaded_person"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "loaded_person"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/plus/internal/model/people/PersonEntity;->zzp([B)Lcom/google/android/gms/plus/internal/model/people/PersonEntity;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/plus/internal/zze;->zzaHl:Lcom/google/android/gms/plus/model/people/Person;

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/google/android/gms/common/internal/zzi;->zza(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/common/api/zza$zzb;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/plus/Moments$LoadMomentsResult;",
            ">;I",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v7, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznL()V

    if-eqz p1, :cond_0

    new-instance v1, Lcom/google/android/gms/plus/internal/zze$zzd;

    invoke-direct {v1, p1}, Lcom/google/android/gms/plus/internal/zze$zzd;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/plus/internal/zzd;

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/plus/internal/zzd;->zza(Lcom/google/android/gms/plus/internal/zzb;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :cond_0
    move-object v1, v7

    goto :goto_0

    :catch_0
    move-exception v0

    const/16 v0, 0x8

    invoke-static {v0}, Lcom/google/android/gms/common/data/DataHolder;->zzbi(I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v0

    invoke-virtual {v1, v0, v7, v7}, Lcom/google/android/gms/plus/internal/zze$zzd;->zza(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public zza(Lcom/google/android/gms/common/api/zza$zzb;Lcom/google/android/gms/plus/model/moments/Moment;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/plus/model/moments/Moment;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznL()V

    if-eqz p1, :cond_0

    new-instance v0, Lcom/google/android/gms/plus/internal/zze$zzc;

    invoke-direct {v0, p1}, Lcom/google/android/gms/plus/internal/zze$zzc;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    move-object v1, v0

    :goto_0
    :try_start_0
    check-cast p2, Lcom/google/android/gms/plus/internal/model/moments/MomentEntity;

    invoke-static {p2}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->zza(Lcom/google/android/gms/common/server/response/FastJsonResponse;)Lcom/google/android/gms/common/server/response/SafeParcelResponse;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/plus/internal/zzd;

    invoke-interface {v0, v1, v3}, Lcom/google/android/gms/plus/internal/zzd;->zza(Lcom/google/android/gms/plus/internal/zzb;Lcom/google/android/gms/common/server/response/SafeParcelResponse;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :cond_0
    move-object v1, v2

    goto :goto_0

    :catch_0
    move-exception v0

    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0x8

    invoke-direct {v0, v3, v2, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/plus/internal/zze$zzc;->zzaO(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_1
.end method

.method public zza(Lcom/google/android/gms/common/api/zza$zzb;Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/plus/People$LoadPeopleResult;",
            ">;",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznL()V

    new-instance v1, Lcom/google/android/gms/plus/internal/zze$zze;

    invoke-direct {v1, p1}, Lcom/google/android/gms/plus/internal/zze$zze;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/plus/internal/zzd;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/plus/internal/zzd;->zza(Lcom/google/android/gms/plus/internal/zzb;Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const/16 v0, 0x8

    invoke-static {v0}, Lcom/google/android/gms/common/data/DataHolder;->zzbi(I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/plus/internal/zze$zze;->zza(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public zzd(Lcom/google/android/gms/common/api/zza$zzb;[Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/plus/People$LoadPeopleResult;",
            ">;[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/plus/internal/zze;->zza(Lcom/google/android/gms/common/api/zza$zzb;Ljava/util/Collection;)V

    return-void
.end method

.method public zzdX(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznL()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/plus/internal/zzd;

    invoke-interface {v0, p1}, Lcom/google/android/gms/plus/internal/zzd;->zzdX(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected zzdu(Landroid/os/IBinder;)Lcom/google/android/gms/plus/internal/zzd;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/plus/internal/zzd$zza;->zzdt(Landroid/os/IBinder;)Lcom/google/android/gms/plus/internal/zzd;

    move-result-object v0

    return-object v0
.end method

.method public zzi(Lcom/google/android/gms/common/api/zza$zzb;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/plus/Moments$LoadMomentsResult;",
            ">;)V"
        }
    .end annotation

    const/4 v3, 0x0

    const/16 v2, 0x14

    const-string v6, "me"

    move-object v0, p0

    move-object v1, p1

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/plus/internal/zze;->zza(Lcom/google/android/gms/common/api/zza$zzb;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public zzj(Lcom/google/android/gms/common/api/zza$zzb;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/plus/People$LoadPeopleResult;",
            ">;)V"
        }
    .end annotation

    const/4 v6, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznL()V

    new-instance v1, Lcom/google/android/gms/plus/internal/zze$zze;

    invoke-direct {v1, p1}, Lcom/google/android/gms/plus/internal/zze$zze;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/plus/internal/zzd;

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, -0x1

    const/4 v5, 0x0

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/plus/internal/zzd;->zza(Lcom/google/android/gms/plus/internal/zzb;IIILjava/lang/String;)Lcom/google/android/gms/common/internal/ICancelToken;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const/16 v0, 0x8

    invoke-static {v0}, Lcom/google/android/gms/common/data/DataHolder;->zzbi(I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v0

    invoke-virtual {v1, v0, v6}, Lcom/google/android/gms/plus/internal/zze$zze;->zza(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public zzk(Lcom/google/android/gms/common/api/zza$zzb;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznL()V

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zzxr()V

    new-instance v1, Lcom/google/android/gms/plus/internal/zze$zzf;

    invoke-direct {v1, p1}, Lcom/google/android/gms/plus/internal/zze$zzf;-><init>(Lcom/google/android/gms/common/api/zza$zzb;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/plus/internal/zzd;

    invoke-interface {v0, v1}, Lcom/google/android/gms/plus/internal/zzd;->zzb(Lcom/google/android/gms/plus/internal/zzb;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const/16 v0, 0x8

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/plus/internal/zze$zzf;->zzi(ILandroid/os/Bundle;)V

    goto :goto_0
.end method

.method protected zzkR()Landroid/os/Bundle;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/plus/internal/zze;->zzkS()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method protected zznN()Landroid/os/Bundle;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/plus/internal/zze;->zzkS()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public zzq(Lcom/google/android/gms/common/api/zza$zzb;Ljava/lang/String;)Lcom/google/android/gms/common/internal/ICancelToken;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/zza$zzb",
            "<",
            "Lcom/google/android/gms/plus/People$LoadPeopleResult;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/internal/ICancelToken;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcom/google/android/gms/plus/internal/zze;->zza(Lcom/google/android/gms/common/api/zza$zzb;ILjava/lang/String;)Lcom/google/android/gms/common/internal/ICancelToken;

    move-result-object v0

    return-object v0
.end method

.method public zzxr()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznL()V

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/google/android/gms/plus/internal/zze;->zzaHl:Lcom/google/android/gms/plus/model/people/Person;

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznM()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/plus/internal/zzd;

    invoke-interface {v0}, Lcom/google/android/gms/plus/internal/zzd;->zzxr()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public zzxu()Lcom/google/android/gms/plus/model/people/Person;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/zze;->zznL()V

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/zze;->zzaHl:Lcom/google/android/gms/plus/model/people/Person;

    return-object v0
.end method
