Liferay.Service.register("Liferay.Service.exportacaoforum", "br.gov.camara.edemocracia.portlets.exportacao.service", "cd-assinaturaforum-portlet");

Liferay.Service.registerClass(
	Liferay.Service.exportacaoforum, "DadosForum",
	{
		getDadosForumExportacao: true,
		getDadosForumAdminExportacao: true
	}
);