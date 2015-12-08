.class public final Lcom/google/android/gms/internal/zzgl;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzgl$zza;
    }
.end annotation


# instance fields
.field private zzEH:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/internal/zzgl$zza;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzgl;->zzEH:Ljava/util/WeakHashMap;

    return-void
.end method


# virtual methods
.method public zzC(Landroid/content/Context;)Lcom/google/android/gms/internal/zzgk;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzgl;->zzEH:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzgl$zza;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzgl$zza;->hasExpired()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/zzbz;->zzuv:Lcom/google/android/gms/internal/zzbv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzbv;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/zzgk$zza;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzgl$zza;->zzEJ:Lcom/google/android/gms/internal/zzgk;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/zzgk$zza;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzgk;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzgk$zza;->zzfJ()Lcom/google/android/gms/internal/zzgk;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzgl;->zzEH:Ljava/util/WeakHashMap;

    new-instance v2, Lcom/google/android/gms/internal/zzgl$zza;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/zzgl$zza;-><init>(Lcom/google/android/gms/internal/zzgl;Lcom/google/android/gms/internal/zzgk;)V

    invoke-virtual {v1, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzgk$zza;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzgk$zza;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzgk$zza;->zzfJ()Lcom/google/android/gms/internal/zzgk;

    move-result-object v0

    goto :goto_0
.end method
