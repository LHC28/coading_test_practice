package data.api.json;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {
	public static void main(String[] args) throws IOException {
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552061/jaywalking/getRestJaywalking"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=xyh7G83G3D4AgX8sLtgxDST1Brqg4otE9ZW6ekhmAOTykr7kJOR39CPGpUn%2F%2FnoP%2FMtl4XEoMnR7yGUzuPvY2Q%3D%3D"); /* Service Key */
		urlBuilder.append("&" + URLEncoder.encode("searchYearCd", "UTF-8") + "=" + URLEncoder.encode("2015", "UTF-8")); /* ��ȸ�ϰ��� �ϴ� ������ �Է�(�� ���� �� ���鸮��) */
		urlBuilder.append("&" + URLEncoder.encode("siDo", "UTF-8") + "=" + URLEncoder.encode("11","UTF-8")); /*
							 * �ڵ����� �ڵ尪��ü ����� ��ü ���ü���Ư���� 11�λ걤���� 26�뱸������ 27��õ������ 28���ֱ����� 29���������� 30��걤����
							 * 31����Ư����ġ�� 36��⵵ 41������ 42��û�ϵ� 43��û���� 44����ϵ� 45���󳲵� 46���ϵ� 47��󳲵� 48����Ư����ġ�� 50
							 */
		urlBuilder.append("&" + URLEncoder.encode("guGun", "UTF-8") + "=" + URLEncoder.encode("680","UTF-8")); /*
							 * �õ� �ڵ����� �ڵ尪����Ư���� ������ 680 ������ 740 ���ϱ� 305 ������ 500 ���Ǳ� 620 ������ 215 ���α� 530 ��õ��
							 * 545 ����� 350 ������ 320 ���빮�� 230 ���۱� 590 ������ 440 ���빮�� 410 ���ʱ� 650 ������ 200 ���ϱ� 290
							 * ���ı� 710 ��õ�� 470 �������� 560 ��걸 170 ���� 380 ���α� 110 �߱� 140 �߶��� 260�λ걤���� ������ 4
							 */
		urlBuilder.append("&" + URLEncoder.encode("type", "UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /* �������(xml/json) */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /* �˻��Ǽ� */
		urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* ������ ��ȣ */

		URL url = new URL(urlBuilder.toString());

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode()); // �����ڵ� ���

		BufferedReader rd;

		// �����ڵ庰 ����
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}

		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}

		rd.close();
		conn.disconnect();
		System.out.println(sb.toString());
	}
}
