@us25
  Feature:admin_should_be_getRequest_and_validate
    Scenario: admin_olusturulan_studenti_okuyabilmeli
      Given daha once olusturulan studenti getRequest ile getir
      Then student olustugunu dogrula