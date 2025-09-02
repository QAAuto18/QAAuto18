function FindProxyForURL(url, host) {
  if (shExpMatch(host, "(*.autotest.com.au|*force.com|*okta*)"))
    return "PROXY 192.168.199.14:6010";
  else return "DIRECT";
}
