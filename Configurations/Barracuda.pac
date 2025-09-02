function FindProxyForURL(url, host) {
  if (shExpMatch(host, "(*.autotest.com.au)"))
    return "PROXY proxy.aws.autotest.com.au:8080";
  else return "DIRECT";
}
