.class Lcom/google/android/gms/tagmanager/zzcp$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/zzcp$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/zzcp;->zza(Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Lcom/google/android/gms/tagmanager/zzco;)Lcom/google/android/gms/tagmanager/zzbw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaNq:Lcom/google/android/gms/tagmanager/zzcp;

.field final synthetic zzaNr:Ljava/util/Map;

.field final synthetic zzaNs:Ljava/util/Map;

.field final synthetic zzaNt:Ljava/util/Map;

.field final synthetic zzaNu:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/zzcp;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzcp$3;->zzaNq:Lcom/google/android/gms/tagmanager/zzcp;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zzcp$3;->zzaNr:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/zzcp$3;->zzaNs:Ljava/util/Map;

    iput-object p4, p0, Lcom/google/android/gms/tagmanager/zzcp$3;->zzaNt:Ljava/util/Map;

    iput-object p5, p0, Lcom/google/android/gms/tagmanager/zzcp$3;->zzaNu:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzqf$zze;Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/zzck;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzqf$zze;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzqf$zza;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/zzqf$zza;",
            ">;",
            "Lcom/google/android/gms/tagmanager/zzck;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcp$3;->zzaNr:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzcp$3;->zzaNs:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {p2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/zzck;->zzyU()Lcom/google/android/gms/tagmanager/zzci;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lcom/google/android/gms/tagmanager/zzci;->zzc(Ljava/util/List;Ljava/util/List;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzcp$3;->zzaNt:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzcp$3;->zzaNu:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {p3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/zzck;->zzyV()Lcom/google/android/gms/tagmanager/zzci;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lcom/google/android/gms/tagmanager/zzci;->zzc(Ljava/util/List;Ljava/util/List;)V

    :cond_1
    return-void
.end method
